package fegssp.app.io.marvelinfoapp.ui.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import fegssp.app.io.marvelinfoapp.databinding.FragmentDetailsCharacterBinding
import fegssp.app.io.marvelinfoapp.ui.base.BaseFragment

class DetailsCharacterFragment : BaseFragment<FragmentDetailsCharacterBinding, DetailsCharacterViewModel>(){
    override val viewModel: DetailsCharacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailsCharacterBinding  = FragmentDetailsCharacterBinding.inflate(inflater,container,false)

}