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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceReadOnlyStatusRequest extends AbstractModel {

    /**
    * <p>实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用<a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。此接口不支持设置云盘版实例为只读。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>是否设置为只读。其中：1表示设置实例为只读，0表示解除只读状态</p>
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
     * Get <p>实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用<a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。此接口不支持设置云盘版实例为只读。</p> 
     * @return InstanceId <p>实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用<a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。此接口不支持设置云盘版实例为只读。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用<a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。此接口不支持设置云盘版实例为只读。</p>
     * @param InstanceId <p>实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同，可使用<a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。此接口不支持设置云盘版实例为只读。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>是否设置为只读。其中：1表示设置实例为只读，0表示解除只读状态</p> 
     * @return ReadOnly <p>是否设置为只读。其中：1表示设置实例为只读，0表示解除只读状态</p>
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set <p>是否设置为只读。其中：1表示设置实例为只读，0表示解除只读状态</p>
     * @param ReadOnly <p>是否设置为只读。其中：1表示设置实例为只读，0表示解除只读状态</p>
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    public ModifyDBInstanceReadOnlyStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceReadOnlyStatusRequest(ModifyDBInstanceReadOnlyStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Long(source.ReadOnly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);

    }
}

