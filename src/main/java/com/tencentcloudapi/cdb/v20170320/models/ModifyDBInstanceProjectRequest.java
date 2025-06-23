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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceProjectRequest extends AbstractModel {

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
说明：可输入多个实例 ID 进行修改，json 格式如下。
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ]
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例所属项目的 ID，可在账号中心下的项目管理页面查询。
说明：此项为必填。
    */
    @SerializedName("NewProjectId")
    @Expose
    private Long NewProjectId;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
说明：可输入多个实例 ID 进行修改，json 格式如下。
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ] 
     * @return InstanceIds 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
说明：可输入多个实例 ID 进行修改，json 格式如下。
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ]
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
说明：可输入多个实例 ID 进行修改，json 格式如下。
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ]
     * @param InstanceIds 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872) 接口获取，其值为输出参数中字段 InstanceId 的值。
说明：可输入多个实例 ID 进行修改，json 格式如下。
[
    "cdb-30z11v8s",
    "cdb-93h11efg"
  ]
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 实例所属项目的 ID，可在账号中心下的项目管理页面查询。
说明：此项为必填。 
     * @return NewProjectId 实例所属项目的 ID，可在账号中心下的项目管理页面查询。
说明：此项为必填。
     */
    public Long getNewProjectId() {
        return this.NewProjectId;
    }

    /**
     * Set 实例所属项目的 ID，可在账号中心下的项目管理页面查询。
说明：此项为必填。
     * @param NewProjectId 实例所属项目的 ID，可在账号中心下的项目管理页面查询。
说明：此项为必填。
     */
    public void setNewProjectId(Long NewProjectId) {
        this.NewProjectId = NewProjectId;
    }

    public ModifyDBInstanceProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceProjectRequest(ModifyDBInstanceProjectRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.NewProjectId != null) {
            this.NewProjectId = new Long(source.NewProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "NewProjectId", this.NewProjectId);

    }
}

