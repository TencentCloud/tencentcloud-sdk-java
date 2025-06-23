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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterDsEventPublisherReq extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务id
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 类型 REST_API、KAFKA
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 配置信息
    */
    @SerializedName("Properties")
    @Expose
    private ParamInfoDs [] Properties;

    /**
    * 描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务id 
     * @return Key 任务id
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 任务id
     * @param Key 任务id
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 类型 REST_API、KAFKA 
     * @return Type 类型 REST_API、KAFKA
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型 REST_API、KAFKA
     * @param Type 类型 REST_API、KAFKA
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 配置信息 
     * @return Properties 配置信息
     */
    public ParamInfoDs [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 配置信息
     * @param Properties 配置信息
     */
    public void setProperties(ParamInfoDs [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 描述信息 
     * @return Description 描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
     * @param Description 描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public RegisterDsEventPublisherReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterDsEventPublisherReq(RegisterDsEventPublisherReq source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Properties != null) {
            this.Properties = new ParamInfoDs[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new ParamInfoDs(source.Properties[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

