package fegssp.app.io.marvelinfoapp.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import fegssp.app.io.marvelinfoapp.databinding.FragmentListCharacterBinding
import fegssp.app.io.marvelinfoapp.ui.base.BaseFragment

@AndroidEntryPoint
class ListCharacterFragment : BaseFragment<FragmentListCharacterBinding, ListCharacterViewModel>() {

    override val viewModel: ListCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentListCharacterBinding =
        FragmentListCharacterBinding.inflate(inflater,container,false)
}