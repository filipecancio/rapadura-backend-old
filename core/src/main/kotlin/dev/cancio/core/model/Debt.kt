package dev.cancio.core.model

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
    val id: Long =0,
    @NotNull
    @Column(nullable = false)
    var name: String = "Debito"
): AbstractEntity {
    override fun getLongId() {
        TODO("Not yet implemented")
    }
}
