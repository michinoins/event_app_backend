SELECT
    id,
    name,
    description,
    event_date,
    available_tickets,
    created_at,
    updated_at
FROM
    events
WHERE
    id = /* eventId */''