package io.arpaul.springbatch.controllers;

import io.keikai.ui.Spreadsheet;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;

public class KeikaiController extends SelectorComposer {

    @Wire
    private Spreadsheet ss;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        //initialize here
    }
}
