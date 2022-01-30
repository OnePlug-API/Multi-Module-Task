package com.oneplug.serviceTest.pensionHolderTest;


import com.oneplug.model.pension.PensionHolder;
import com.oneplug.model.pensionDto.PensionDto;
import com.oneplug.model.pensionDto.PensionHolderDto;
import com.oneplug.repository.pensionRepository.PensionHolderRepository;
import com.oneplug.service.pensionService.PensionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class PensionServiceImplTest {

    @Mock
    private PensionHolderRepository pensionHolderRepository;

    @InjectMocks
    private PensionServiceImpl pensionService;
    private PensionHolderDto pensionHolderDto;
    private PensionDto pensionDto;
    private PensionHolder pensionHolder;

    @BeforeEach
    void setUp() {

        pensionHolderDto = new PensionHolderDto();
        pensionDto = new PensionDto();
        pensionHolder = new PensionHolder();

    }

    @Test
    void testPensionHolderService(){
        pensionService.savePension(pensionHolderDto, pensionDto);
        verify(pensionHolderRepository).save(pensionHolder);
    }
}