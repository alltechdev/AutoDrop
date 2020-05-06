package org.fossify.phone.activities

import org.fossify.commons.activities.BaseSimpleActivity
import org.fossify.phone.R

open class SimpleActivity : BaseSimpleActivity() {
    override fun getAppIconIDs() = ArrayList<Int>()

    override fun getAppLauncherName() = getString(R.string.app_launcher_name)

    override fun getRepositoryName() = "AutoDrop"
}
