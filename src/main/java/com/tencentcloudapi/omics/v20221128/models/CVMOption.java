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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CVMOption extends AbstractModel {

    /**
    * <p>云服务器可用区。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>云服务器实例规格。详情参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get <p>云服务器可用区。</p> 
     * @return Zone <p>云服务器可用区。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>云服务器可用区。</p>
     * @param Zone <p>云服务器可用区。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>云服务器实例规格。详情参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述</p> 
     * @return InstanceType <p>云服务器实例规格。详情参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>云服务器实例规格。详情参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述</p>
     * @param InstanceType <p>云服务器实例规格。详情参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public CVMOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CVMOption(CVMOption source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

