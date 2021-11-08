package es.devcenter.service;

import es.devcenter.dto.CocheDto;
import es.devcenter.repository.CocheRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.transaction.Transactional;

@Service
public class CocheService {

    @Inject
    private CocheRepository cocheRepository;

    @Inject
    private ModelMapper mapper;

    //Encuentra un coche por Id
    @Transactional(rollbackOn = Exception.class)
    public CocheDto findById(Long id){

        try{
            return mapper.map(this.cocheRepository.findById(id).get(), CocheDto.class);
        }catch (Exception e){
            return null;
        }

    }

}
