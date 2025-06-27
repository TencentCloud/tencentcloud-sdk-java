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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayManage extends AbstractModel {

    /**
    * 主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 公共字段
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * Url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Icon
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 缩略图
    */
    @SerializedName("Screenshot")
    @Expose
    private String Screenshot;

    /**
    * 状态码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 后台Host
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 状态：not_converged:未收敛, converged:已收敛, ignore:已忽略

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 主键ID 
     * @return Id 主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
     * @param Id 主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 公共字段 
     * @return DisplayToolCommon 公共字段
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set 公共字段
     * @param DisplayToolCommon 公共字段
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get Url 
     * @return Url Url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Url
     * @param Url Url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 标题 
     * @return Title 标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 标题
     * @param Title 标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Icon 
     * @return Icon Icon
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set Icon
     * @param Icon Icon
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 缩略图 
     * @return Screenshot 缩略图
     */
    public String getScreenshot() {
        return this.Screenshot;
    }

    /**
     * Set 缩略图
     * @param Screenshot 缩略图
     */
    public void setScreenshot(String Screenshot) {
        this.Screenshot = Screenshot;
    }

    /**
     * Get 状态码 
     * @return Code 状态码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 状态码
     * @param Code 状态码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 后台Host 
     * @return Host 后台Host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 后台Host
     * @param Host 后台Host
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 状态：not_converged:未收敛, converged:已收敛, ignore:已忽略
 
     * @return Status 状态：not_converged:未收敛, converged:已收敛, ignore:已忽略

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：not_converged:未收敛, converged:已收敛, ignore:已忽略

     * @param Status 状态：not_converged:未收敛, converged:已收敛, ignore:已忽略

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DisplayManage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayManage(DisplayManage source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.Screenshot != null) {
            this.Screenshot = new String(source.Screenshot);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "Screenshot", this.Screenshot);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

