UPDATE
    `events`
SET
    available_tickets = available_tickets - /* bookTicketCnt */2
WHERE
    id = /* eventId */'event1';