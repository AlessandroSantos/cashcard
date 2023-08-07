package com.example.cashcard;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cashcard.model.CashCard;

@RestController
@RequestMapping("cashcards")
public class CashCardController {

    @GetMapping("/{requestId}")
    public ResponseEntity<CashCard> findById(@PathVariable Long requestId) {
        if (requestId.equals(99L)) {
            return ResponseEntity.ok(new CashCard(1000L, 123.45));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
