/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ds.v20180523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSealRequest extends AbstractModel{

    /**
    * 模块名SealMng
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名CreateSeal
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 帐号ID
    */
    @SerializedName("AccountResId")
    @Expose
    private String AccountResId;

    /**
    * 签章链接，图片必须为png格式
    */
    @SerializedName("ImgUrl")
    @Expose
    private String ImgUrl;

    /**
    * 图片数据，base64编码
    */
    @SerializedName("ImgData")
    @Expose
    private String ImgData;

    /**
     * Get 模块名SealMng 
     * @return Module 模块名SealMng
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名SealMng
     * @param Module 模块名SealMng
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名CreateSeal 
     * @return Operation 操作名CreateSeal
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名CreateSeal
     * @param Operation 操作名CreateSeal
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 帐号ID 
     * @return AccountResId 帐号ID
     */
    public String getAccountResId() {
        return this.AccountResId;
    }

    /**
     * Set 帐号ID
     * @param AccountResId 帐号ID
     */
    public void setAccountResId(String AccountResId) {
        this.AccountResId = AccountResId;
    }

    /**
     * Get 签章链接，图片必须为png格式 
     * @return ImgUrl 签章链接，图片必须为png格式
     */
    public String getImgUrl() {
        return this.ImgUrl;
    }

    /**
     * Set 签章链接，图片必须为png格式
     * @param ImgUrl 签章链接，图片必须为png格式
     */
    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    /**
     * Get 图片数据，base64编码 
     * @return ImgData 图片数据，base64编码
     */
    public String getImgData() {
        return this.ImgData;
    }

    /**
     * Set 图片数据，base64编码
     * @param ImgData 图片数据，base64编码
     */
    public void setImgData(String ImgData) {
        this.ImgData = ImgData;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "AccountResId", this.AccountResId);
        this.setParamSimple(map, prefix + "ImgUrl", this.ImgUrl);
        this.setParamSimple(map, prefix + "ImgData", this.ImgData);

    }
}

