package com.dyego;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)       // COM ESSA LINHA DA NULLPOINTER EXCEPTION
@RunWith(MockitoJUnitRunner.class)          // SO RODA SE TIVER ESSA LINHA

public class VolumeTest {
    
    // 1 - Crie um mock da classe AudioManager
    //@Mock
    @Spy
    AudioManager am;

    // 2 - injete um mock da classe VolumeUtil
    @InjectMocks
    VolumeUtil vu;


    @Test
    public void testAudioManagerSetVolume() {
        int vol = 10;
        // 3 - realize uma chamada para o método maximizeVolume do objeto VolumeUtil
        
        vu.maximizeVolume(vol);
        //am.setVolume(vol);
        System.out.println(am.getVolume());
        //System.out.println(vol);

        // 4 - Verifique se o método setVolume foi chamado uma única vez
        if(am.getVolume() == vol)
            {
                System.out.println("FUNCIONOU O MOCK");
                    }
        else
            {
                System.out.println("NÃO FUNCIONOU O MOCK");
                    }
}
}
