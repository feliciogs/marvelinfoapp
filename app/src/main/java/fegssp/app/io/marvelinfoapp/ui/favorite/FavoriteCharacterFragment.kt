package fegssp.app.io.marvelinfoapp.ui.favorite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import fegssp.app.io.marvelinfoapp.databinding.FragmentFavoriteCharacterBinding
import fegssp.app.io.marvelinfoapp.ui.base.BaseFragment

class FavoriteCharacterFragment : BaseFragment<FragmentFavoriteCharacterBinding, FavoriteCharacterViewModel>() {
    override val viewModel: FavoriteCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFavoriteCharacterBinding  = FragmentFavoriteCharacterBinding.inflate(inflater,container,false)
}