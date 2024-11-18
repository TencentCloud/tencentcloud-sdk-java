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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGeneralApmApplicationConfigRequest extends AbstractModel {

    /**
    * 业务系统Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要修改的字段key value分别指定字段名、字段值
[具体字段请见](https://cloud.tencent.com/document/product/248/111241)
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * 需要修改配置的应用列表名称	
    */
    @SerializedName("ServiceNames")
    @Expose
    private String [] ServiceNames;

    /**
     * Get 业务系统Id 
     * @return InstanceId 业务系统Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务系统Id
     * @param InstanceId 业务系统Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要修改的字段key value分别指定字段名、字段值
[具体字段请见](https://cloud.tencent.com/document/product/248/111241) 
     * @return Tags 需要修改的字段key value分别指定字段名、字段值
[具体字段请见](https://cloud.tencent.com/document/product/248/111241)
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 需要修改的字段key value分别指定字段名、字段值
[具体字段请见](https://cloud.tencent.com/document/product/248/111241)
     * @param Tags 需要修改的字段key value分别指定字段名、字段值
[具体字段请见](https://cloud.tencent.com/document/product/248/111241)
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 需要修改配置的应用列表名称	 
     * @return ServiceNames 需要修改配置的应用列表名称	
     */
    public String [] getServiceNames() {
        return this.ServiceNames;
    }

    /**
     * Set 需要修改配置的应用列表名称	
     * @param ServiceNames 需要修改配置的应用列表名称	
     */
    public void setServiceNames(String [] ServiceNames) {
        this.ServiceNames = ServiceNames;
    }

    public ModifyGeneralApmApplicationConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGeneralApmApplicationConfigRequest(ModifyGeneralApmApplicationConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.ServiceNames != null) {
            this.ServiceNames = new String[source.ServiceNames.length];
            for (int i = 0; i < source.ServiceNames.length; i++) {
                this.ServiceNames[i] = new String(source.ServiceNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "ServiceNames.", this.ServiceNames);

    }
}

