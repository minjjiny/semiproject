package org.example.semiproject.gallery.repository;

import org.example.semiproject.gallery.domain.Gallery;
import org.example.semiproject.gallery.domain.dto.GalleryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GalleryRepository extends JpaRepository<Gallery, Long> {
    @Query(value = "SELECT ggno, title, userid, regdate, simgname FROM gallerys ORDER BY ggno DESC", nativeQuery = true)
    List<GalleryDTO> selectGallery();
}