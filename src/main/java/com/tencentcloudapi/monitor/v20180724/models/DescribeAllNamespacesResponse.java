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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllNamespacesResponse extends AbstractModel{

    /**
    * 云产品的告警策略类型，已废弃
    */
    @SerializedName("QceNamespaces")
    @Expose
    private CommonNamespace QceNamespaces;

    /**
    * 其他告警策略类型，已废弃
    */
    @SerializedName("CustomNamespaces")
    @Expose
    private CommonNamespace CustomNamespaces;

    /**
    * 云产品的告警策略类型
    */
    @SerializedName("QceNamespacesNew")
    @Expose
    private CommonNamespace [] QceNamespacesNew;

    /**
    * 其他告警策略类型，暂不支持
    */
    @SerializedName("CustomNamespacesNew")
    @Expose
    private CommonNamespace [] CustomNamespacesNew;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云产品的告警策略类型，已废弃 
     * @return QceNamespaces 云产品的告警策略类型，已废弃
     */
    public CommonNamespace getQceNamespaces() {
        return this.QceNamespaces;
    }

    /**
     * Set 云产品的告警策略类型，已废弃
     * @param QceNamespaces 云产品的告警策略类型，已废弃
     */
    public void setQceNamespaces(CommonNamespace QceNamespaces) {
        this.QceNamespaces = QceNamespaces;
    }

    /**
     * Get 其他告警策略类型，已废弃 
     * @return CustomNamespaces 其他告警策略类型，已废弃
     */
    public CommonNamespace getCustomNamespaces() {
        return this.CustomNamespaces;
    }

    /**
     * Set 其他告警策略类型，已废弃
     * @param CustomNamespaces 其他告警策略类型，已废弃
     */
    public void setCustomNamespaces(CommonNamespace CustomNamespaces) {
        this.CustomNamespaces = CustomNamespaces;
    }

    /**
     * Get 云产品的告警策略类型 
     * @return QceNamespacesNew 云产品的告警策略类型
     */
    public CommonNamespace [] getQceNamespacesNew() {
        return this.QceNamespacesNew;
    }

    /**
     * Set 云产品的告警策略类型
     * @param QceNamespacesNew 云产品的告警策略类型
     */
    public void setQceNamespacesNew(CommonNamespace [] QceNamespacesNew) {
        this.QceNamespacesNew = QceNamespacesNew;
    }

    /**
     * Get 其他告警策略类型，暂不支持 
     * @return CustomNamespacesNew 其他告警策略类型，暂不支持
     */
    public CommonNamespace [] getCustomNamespacesNew() {
        return this.CustomNamespacesNew;
    }

    /**
     * Set 其他告警策略类型，暂不支持
     * @param CustomNamespacesNew 其他告警策略类型，暂不支持
     */
    public void setCustomNamespacesNew(CommonNamespace [] CustomNamespacesNew) {
        this.CustomNamespacesNew = CustomNamespacesNew;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAllNamespacesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllNamespacesResponse(DescribeAllNamespacesResponse source) {
        if (source.QceNamespaces != null) {
            this.QceNamespaces = new CommonNamespace(source.QceNamespaces);
        }
        if (source.CustomNamespaces != null) {
            this.CustomNamespaces = new CommonNamespace(source.CustomNamespaces);
        }
        if (source.QceNamespacesNew != null) {
            this.QceNamespacesNew = new CommonNamespace[source.QceNamespacesNew.length];
            for (int i = 0; i < source.QceNamespacesNew.length; i++) {
                this.QceNamespacesNew[i] = new CommonNamespace(source.QceNamespacesNew[i]);
            }
        }
        if (source.CustomNamespacesNew != null) {
            this.CustomNamespacesNew = new CommonNamespace[source.CustomNamespacesNew.length];
            for (int i = 0; i < source.CustomNamespacesNew.length; i++) {
                this.CustomNamespacesNew[i] = new CommonNamespace(source.CustomNamespacesNew[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "QceNamespaces.", this.QceNamespaces);
        this.setParamObj(map, prefix + "CustomNamespaces.", this.CustomNamespaces);
        this.setParamArrayObj(map, prefix + "QceNamespacesNew.", this.QceNamespacesNew);
        this.setParamArrayObj(map, prefix + "CustomNamespacesNew.", this.CustomNamespacesNew);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

