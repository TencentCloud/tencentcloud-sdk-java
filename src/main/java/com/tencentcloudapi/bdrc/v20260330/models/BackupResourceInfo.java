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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupResourceInfo extends AbstractModel {

    /**
    * <p>资源类型</p><p>枚举值：</p><ul><li>CVM_AGENT： CVM文件备份</li><li>COS_AGENT： COS备份</li><li>CFS_AGENT： CFS文件备份</li><li>INSTANCE： CVM整机备份</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>资源ID</p>
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
     * Get <p>资源类型</p><p>枚举值：</p><ul><li>CVM_AGENT： CVM文件备份</li><li>COS_AGENT： COS备份</li><li>CFS_AGENT： CFS文件备份</li><li>INSTANCE： CVM整机备份</li></ul> 
     * @return ResourceType <p>资源类型</p><p>枚举值：</p><ul><li>CVM_AGENT： CVM文件备份</li><li>COS_AGENT： COS备份</li><li>CFS_AGENT： CFS文件备份</li><li>INSTANCE： CVM整机备份</li></ul>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型</p><p>枚举值：</p><ul><li>CVM_AGENT： CVM文件备份</li><li>COS_AGENT： COS备份</li><li>CFS_AGENT： CFS文件备份</li><li>INSTANCE： CVM整机备份</li></ul>
     * @param ResourceType <p>资源类型</p><p>枚举值：</p><ul><li>CVM_AGENT： CVM文件备份</li><li>COS_AGENT： COS备份</li><li>CFS_AGENT： CFS文件备份</li><li>INSTANCE： CVM整机备份</li></ul>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>资源ID</p> 
     * @return ResourceIds <p>资源ID</p>
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set <p>资源ID</p>
     * @param ResourceIds <p>资源ID</p>
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    public BackupResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupResourceInfo(BackupResourceInfo source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);

    }
}

