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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventBusParam extends AbstractModel{

    /**
    * 资源类型。EB_COS/EB_ES/EB_CLS
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 是否为自建集群
    */
    @SerializedName("SelfBuilt")
    @Expose
    private Boolean SelfBuilt;

    /**
    * 实例资源
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * SCF云函数命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * SCF云函数函数名
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * SCF云函数版本及别名
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
     * Get 资源类型。EB_COS/EB_ES/EB_CLS 
     * @return Type 资源类型。EB_COS/EB_ES/EB_CLS
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 资源类型。EB_COS/EB_ES/EB_CLS
     * @param Type 资源类型。EB_COS/EB_ES/EB_CLS
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 是否为自建集群 
     * @return SelfBuilt 是否为自建集群
     */
    public Boolean getSelfBuilt() {
        return this.SelfBuilt;
    }

    /**
     * Set 是否为自建集群
     * @param SelfBuilt 是否为自建集群
     */
    public void setSelfBuilt(Boolean SelfBuilt) {
        this.SelfBuilt = SelfBuilt;
    }

    /**
     * Get 实例资源 
     * @return Resource 实例资源
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 实例资源
     * @param Resource 实例资源
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get SCF云函数命名空间 
     * @return Namespace SCF云函数命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set SCF云函数命名空间
     * @param Namespace SCF云函数命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get SCF云函数函数名 
     * @return FunctionName SCF云函数函数名
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set SCF云函数函数名
     * @param FunctionName SCF云函数函数名
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get SCF云函数版本及别名 
     * @return Qualifier SCF云函数版本及别名
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set SCF云函数版本及别名
     * @param Qualifier SCF云函数版本及别名
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    public EventBusParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventBusParam(EventBusParam source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SelfBuilt != null) {
            this.SelfBuilt = new Boolean(source.SelfBuilt);
        }
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SelfBuilt", this.SelfBuilt);
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);

    }
}

