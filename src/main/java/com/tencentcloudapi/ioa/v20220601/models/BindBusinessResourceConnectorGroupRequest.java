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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindBusinessResourceConnectorGroupRequest extends AbstractModel {

    /**
    * 要绑定连接器的业务资源id，创建时候响应会返回，修改调用端自己获取传递
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * 业务资源要绑定的连接器id
    */
    @SerializedName("ConnectorGroupId")
    @Expose
    private String ConnectorGroupId;

    /**
     * Get 要绑定连接器的业务资源id，创建时候响应会返回，修改调用端自己获取传递 
     * @return ServiceId 要绑定连接器的业务资源id，创建时候响应会返回，修改调用端自己获取传递
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 要绑定连接器的业务资源id，创建时候响应会返回，修改调用端自己获取传递
     * @param ServiceId 要绑定连接器的业务资源id，创建时候响应会返回，修改调用端自己获取传递
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 业务资源要绑定的连接器id 
     * @return ConnectorGroupId 业务资源要绑定的连接器id
     */
    public String getConnectorGroupId() {
        return this.ConnectorGroupId;
    }

    /**
     * Set 业务资源要绑定的连接器id
     * @param ConnectorGroupId 业务资源要绑定的连接器id
     */
    public void setConnectorGroupId(String ConnectorGroupId) {
        this.ConnectorGroupId = ConnectorGroupId;
    }

    public BindBusinessResourceConnectorGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindBusinessResourceConnectorGroupRequest(BindBusinessResourceConnectorGroupRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.ConnectorGroupId != null) {
            this.ConnectorGroupId = new String(source.ConnectorGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ConnectorGroupId", this.ConnectorGroupId);

    }
}

