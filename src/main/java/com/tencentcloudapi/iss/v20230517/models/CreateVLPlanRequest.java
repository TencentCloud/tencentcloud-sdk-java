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

public class CreateVLPlanRequest extends AbstractModel {

    /**
    * <p>计划名称，仅支持中文/英文/数字/_/-，最长 32 个字符</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>关联的视觉理解模板 ID</p>
    */
    @SerializedName("VLTemplateId")
    @Expose
    private String VLTemplateId;

    /**
    * <p>计划描述，最长 256 个字符</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>截图文件存储天数，范围 [7, 1080]；图片模式必填，视频模式不传</p>
    */
    @SerializedName("FileExpires")
    @Expose
    private Long FileExpires;

    /**
    * <p>回调通知配置</p>
    */
    @SerializedName("Callback")
    @Expose
    private CallbackURL Callback;

    /**
     * Get <p>计划名称，仅支持中文/英文/数字/_/-，最长 32 个字符</p> 
     * @return Name <p>计划名称，仅支持中文/英文/数字/_/-，最长 32 个字符</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>计划名称，仅支持中文/英文/数字/_/-，最长 32 个字符</p>
     * @param Name <p>计划名称，仅支持中文/英文/数字/_/-，最长 32 个字符</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>关联的视觉理解模板 ID</p> 
     * @return VLTemplateId <p>关联的视觉理解模板 ID</p>
     */
    public String getVLTemplateId() {
        return this.VLTemplateId;
    }

    /**
     * Set <p>关联的视觉理解模板 ID</p>
     * @param VLTemplateId <p>关联的视觉理解模板 ID</p>
     */
    public void setVLTemplateId(String VLTemplateId) {
        this.VLTemplateId = VLTemplateId;
    }

    /**
     * Get <p>计划描述，最长 256 个字符</p> 
     * @return Describe <p>计划描述，最长 256 个字符</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>计划描述，最长 256 个字符</p>
     * @param Describe <p>计划描述，最长 256 个字符</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>截图文件存储天数，范围 [7, 1080]；图片模式必填，视频模式不传</p> 
     * @return FileExpires <p>截图文件存储天数，范围 [7, 1080]；图片模式必填，视频模式不传</p>
     */
    public Long getFileExpires() {
        return this.FileExpires;
    }

    /**
     * Set <p>截图文件存储天数，范围 [7, 1080]；图片模式必填，视频模式不传</p>
     * @param FileExpires <p>截图文件存储天数，范围 [7, 1080]；图片模式必填，视频模式不传</p>
     */
    public void setFileExpires(Long FileExpires) {
        this.FileExpires = FileExpires;
    }

    /**
     * Get <p>回调通知配置</p> 
     * @return Callback <p>回调通知配置</p>
     */
    public CallbackURL getCallback() {
        return this.Callback;
    }

    /**
     * Set <p>回调通知配置</p>
     * @param Callback <p>回调通知配置</p>
     */
    public void setCallback(CallbackURL Callback) {
        this.Callback = Callback;
    }

    public CreateVLPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVLPlanRequest(CreateVLPlanRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VLTemplateId != null) {
            this.VLTemplateId = new String(source.VLTemplateId);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
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
        this.setParamSimple(map, prefix + "VLTemplateId", this.VLTemplateId);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "FileExpires", this.FileExpires);
        this.setParamObj(map, prefix + "Callback.", this.Callback);

    }
}

