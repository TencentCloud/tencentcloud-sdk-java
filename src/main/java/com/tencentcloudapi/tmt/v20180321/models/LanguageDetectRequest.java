package com.tencentcloudapi.tmt.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class LanguageDetectRequest  extends AbstractModel{


    /**
    * 待识别的文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;
    

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;
    

    /**
     * 获取待识别的文本
     * @return Text 待识别的文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * 设置待识别的文本
     * @param Text 待识别的文本
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * 获取项目id
     * @return ProjectId 项目id
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

