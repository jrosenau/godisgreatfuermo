package org.example.godisgreat.ServiceTest;


import org.assertj.core.api.Assertions;
import org.example.godisgreat.entity.Class;
import org.example.godisgreat.repository.ClassRepository;
import org.example.godisgreat.service.ClassService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClassServiceTest {
    @Mock
    ClassRepository classRepository;


    @InjectMocks
    ClassService classService;


    @Test
    public void addStudent_ReturnStudent(){
        Class savedClass = Class.builder()
                .name("4AHEL").build();

        when(classRepository.save(Mockito.any(Class.class))).thenReturn(savedClass);
        Class class1 = classService.create(savedClass);
        Assertions.assertThat(class1).isNotNull();
        Assertions.assertThat(class1.getName()).isEqualTo("4AHEL");

    }
}
