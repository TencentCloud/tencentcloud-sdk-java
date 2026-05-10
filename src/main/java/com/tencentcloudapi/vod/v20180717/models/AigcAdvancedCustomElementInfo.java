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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AigcAdvancedCustomElementInfo extends AbstractModel {

    /**
    * <p>主体 ID。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>主体名字。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>主体音色 ID。</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>主体描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>主体创建时间。格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>主体 ID。</p> 
     * @return Id <p>主体 ID。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>主体 ID。</p>
     * @param Id <p>主体 ID。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>主体名字。</p> 
     * @return Name <p>主体名字。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>主体名字。</p>
     * @param Name <p>主体名字。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>主体音色 ID。</p> 
     * @return VoiceId <p>主体音色 ID。</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>主体音色 ID。</p>
     * @param VoiceId <p>主体音色 ID。</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>主体描述。</p> 
     * @return Description <p>主体描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>主体描述。</p>
     * @param Description <p>主体描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>主体创建时间。格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p> 
     * @return CreateTime <p>主体创建时间。格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>主体创建时间。格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     * @param CreateTime <p>主体创建时间。格式按照 ISO 8601标准表示，详见 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式说明</a>。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public AigcAdvancedCustomElementInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcAdvancedCustomElementInfo(AigcAdvancedCustomElementInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

