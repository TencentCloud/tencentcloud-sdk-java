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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MmsInstanceInfoList extends AbstractModel{

    /**
    * 总数据量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 彩信实例状态信息列表
    */
    @SerializedName("List")
    @Expose
    private MmsInstanceInfo [] List;

    /**
     * Get 总数据量 
     * @return Total 总数据量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数据量
     * @param Total 总数据量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 彩信实例状态信息列表 
     * @return List 彩信实例状态信息列表
     */
    public MmsInstanceInfo [] getList() {
        return this.List;
    }

    /**
     * Set 彩信实例状态信息列表
     * @param List 彩信实例状态信息列表
     */
    public void setList(MmsInstanceInfo [] List) {
        this.List = List;
    }

    public MmsInstanceInfoList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MmsInstanceInfoList(MmsInstanceInfoList source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.List != null) {
            this.List = new MmsInstanceInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new MmsInstanceInfo(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

