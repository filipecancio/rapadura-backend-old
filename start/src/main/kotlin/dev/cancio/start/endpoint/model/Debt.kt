package dev.cancio.start.endpoint.model

import lombok.*
import org.jetbrains.annotations.NotNull
import javax.persistence.*

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
data class Debt(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    val id: Long,
    @NotNull
    @Column(nullable = false)
    val name: String
): AbstractEntity {
    override fun getLongId() {
        TODO("Not yet implemented")
    }
}
