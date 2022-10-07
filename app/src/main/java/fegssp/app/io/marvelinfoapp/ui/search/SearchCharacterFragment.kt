package fegssp.app.io.marvelinfoapp.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import fegssp.app.io.marvelinfoapp.databinding.FragmentSearchCharacterBinding
import fegssp.app.io.marvelinfoapp.ui.base.BaseFragment

class SearchCharacterFragment : BaseFragment<FragmentSearchCharacterBinding, SearchCharacterViewModel>() {

    override val viewModel: SearchCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchCharacterBinding = FragmentSearchCharacterBinding.inflate(inflater,container,false)
}