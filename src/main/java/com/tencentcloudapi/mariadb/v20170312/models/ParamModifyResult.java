package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ParamModifyResult  extends AbstractModel{


    /**
    * 修改参数名字
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * 参数修改结果。0表示修改成功；-1表示修改失败；-2表示该参数值非法
    */
    @SerializedName("Code")
    @Expose
    private Integer Code;

    /**
     * 获取修改参数名字
     * @return Param 修改参数名字
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * 设置修改参数名字
     * @param Param 修改参数名字
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * 获取参数修改结果。0表示修改成功；-1表示修改失败；-2表示该参数值非法
     * @return Code 参数修改结果。0表示修改成功；-1表示修改失败；-2表示该参数值非法
     */
    public Integer getCode() {
        return this.Code;
    }

    /**
     * 设置参数修改结果。0表示修改成功；-1表示修改失败；-2表示该参数值非法
     * @param Code 参数修改结果。0表示修改成功；-1表示修改失败；-2表示该参数值非法
     */
    public void setCode(Integer Code) {
        this.Code = Code;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

