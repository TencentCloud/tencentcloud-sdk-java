/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVideoSnapshotConfigRequest extends AbstractModel {

    /**
    * <p>截图配置名称</p><p>入参限制：中文、英文、数字、“-”、“_” 长度不超过128个字符</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>截图模板Id</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>图片文件的热存储天数</p><p>枚举值：</p><ul><li>7： 7天</li><li>15： 15天</li><li>30： 30天</li><li>60： 60天</li><li>90： 90天</li><li>180： 180天</li><li>270： 270天</li><li>360： 360天</li><li>540： 540天</li><li>720： 720天</li><li>900： 900天</li><li>1080： 1080天</li></ul>
    */
    @SerializedName("FileExpires")
    @Expose
    private Long FileExpires;

    /**
    * <p>截图结果回调地址</p>
    */
    @SerializedName("Callback")
    @Expose
    private CallbackURL Callback;

    /**
     * Get <p>截图配置名称</p><p>入参限制：中文、英文、数字、“-”、“_” 长度不超过128个字符</p> 
     * @return Name <p>截图配置名称</p><p>入参限制：中文、英文、数字、“-”、“_” 长度不超过128个字符</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>截图配置名称</p><p>入参限制：中文、英文、数字、“-”、“_” 长度不超过128个字符</p>
     * @param Name <p>截图配置名称</p><p>入参限制：中文、英文、数字、“-”、“_” 长度不超过128个字符</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>截图模板Id</p> 
     * @return TemplateId <p>截图模板Id</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>截图模板Id</p>
     * @param TemplateId <p>截图模板Id</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>图片文件的热存储天数</p><p>枚举值：</p><ul><li>7： 7天</li><li>15： 15天</li><li>30： 30天</li><li>60： 60天</li><li>90： 90天</li><li>180： 180天</li><li>270： 270天</li><li>360： 360天</li><li>540： 540天</li><li>720： 720天</li><li>900： 900天</li><li>1080： 1080天</li></ul> 
     * @return FileExpires <p>图片文件的热存储天数</p><p>枚举值：</p><ul><li>7： 7天</li><li>15： 15天</li><li>30： 30天</li><li>60： 60天</li><li>90： 90天</li><li>180： 180天</li><li>270： 270天</li><li>360： 360天</li><li>540： 540天</li><li>720： 720天</li><li>900： 900天</li><li>1080： 1080天</li></ul>
     */
    public Long getFileExpires() {
        return this.FileExpires;
    }

    /**
     * Set <p>图片文件的热存储天数</p><p>枚举值：</p><ul><li>7： 7天</li><li>15： 15天</li><li>30： 30天</li><li>60： 60天</li><li>90： 90天</li><li>180： 180天</li><li>270： 270天</li><li>360： 360天</li><li>540： 540天</li><li>720： 720天</li><li>900： 900天</li><li>1080： 1080天</li></ul>
     * @param FileExpires <p>图片文件的热存储天数</p><p>枚举值：</p><ul><li>7： 7天</li><li>15： 15天</li><li>30： 30天</li><li>60： 60天</li><li>90： 90天</li><li>180： 180天</li><li>270： 270天</li><li>360： 360天</li><li>540： 540天</li><li>720： 720天</li><li>900： 900天</li><li>1080： 1080天</li></ul>
     */
    public void setFileExpires(Long FileExpires) {
        this.FileExpires = FileExpires;
    }

    /**
     * Get <p>截图结果回调地址</p> 
     * @return Callback <p>截图结果回调地址</p>
     */
    public CallbackURL getCallback() {
        return this.Callback;
    }

    /**
     * Set <p>截图结果回调地址</p>
     * @param Callback <p>截图结果回调地址</p>
     */
    public void setCallback(CallbackURL Callback) {
        this.Callback = Callback;
    }

    public CreateVideoSnapshotConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVideoSnapshotConfigRequest(CreateVideoSnapshotConfigRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.FileExpires != null) {
            this.FileExpires = new Long(source.FileExpires);
        }
        if (source.Callback != null) {
            this.Callback = new CallbackURL(source.Callback);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "FileExpires", this.FileExpires);
        this.setParamObj(map, prefix + "Callback.", this.Callback);

    }
}

