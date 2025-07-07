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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncDepartmentData extends AbstractModel {

    /**
    * 操作类型 1:获取科室列表  2:同步科室信息（增、改） 3:删除科室
    */
    @SerializedName("Cmd")
    @Expose
    private Long Cmd;

    /**
    * 科室列表
    */
    @SerializedName("List")
    @Expose
    private Department [] List;

    /**
     * Get 操作类型 1:获取科室列表  2:同步科室信息（增、改） 3:删除科室 
     * @return Cmd 操作类型 1:获取科室列表  2:同步科室信息（增、改） 3:删除科室
     */
    public Long getCmd() {
        return this.Cmd;
    }

    /**
     * Set 操作类型 1:获取科室列表  2:同步科室信息（增、改） 3:删除科室
     * @param Cmd 操作类型 1:获取科室列表  2:同步科室信息（增、改） 3:删除科室
     */
    public void setCmd(Long Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get 科室列表 
     * @return List 科室列表
     */
    public Department [] getList() {
        return this.List;
    }

    /**
     * Set 科室列表
     * @param List 科室列表
     */
    public void setList(Department [] List) {
        this.List = List;
    }

    public SyncDepartmentData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncDepartmentData(SyncDepartmentData source) {
        if (source.Cmd != null) {
            this.Cmd = new Long(source.Cmd);
        }
        if (source.List != null) {
            this.List = new Department[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new Department(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

