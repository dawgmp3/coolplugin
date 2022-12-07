package com.example.coolplugin;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.ui.Messages;

public class VkAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        Editor editor = event.getData(PlatformDataKeys.EDITOR);

        String selectedText = editor.getSelectionModel().getSelectedText();

        if (selectedText != null) {
            String url = "https://api.vk.com/method/messages.send?" +
                    "user_id=274833356&" +
                    "random_id= " + Math.random() +"&" +
                    "message=" + selectedText + "&" +
                    "access_token=vk1.a.zePEvqnEMnKeuQI5-vq8dx2lDdQ9oB9lSgIx7hBazoyT3rv8E4UthaZtrYM4dgBQQ5btiN8llQtC7GlAaJMyOENUAjagE4-CZYkuHvO8ZXLxg7nxHNkxo7Eo6MbbBep57Nhxr4acRAC4hCJHJb_H_j0_AGW9hOvF8uxpM90wUTVSaTXbqGux1LllqkSFDZT1S23fqrSq1iNyp9WJYjIgdg&" +
                    "v=5.131";
            BrowserUtil.browse(url);


        } else {
            Messages.showMessageDialog("Selection is empty, could you please select something?", "VK Action", Messages.getInformationIcon());
        }
    }

    @Override
    public boolean isDumbAware() {
        return false;
    }
}
