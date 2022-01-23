package pensionService;


import pensionDto.PensionDto;
import pensionDto.PensionHolderDto;

public interface PensionService {

    void savePension(PensionHolderDto pensionHolderDto, PensionDto pensionDto);
}
