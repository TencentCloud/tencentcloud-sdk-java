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

public class DescribeDeviceDetailListRequest extends AbstractModel {

    /**
    * 系统类型(只支持32位)
    */
    @SerializedName("OsType")
    @Expose
    private Long OsType;

    /**
    * 终端分组id(只支持32位)
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 过滤条件、分页参数
<li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li>
    */
    @SerializedName("Condition")
    @Expose
    private Condition Condition;

    /**
     * Get 系统类型(只支持32位) 
     * @return OsType 系统类型(只支持32位)
     */
    public Long getOsType() {
        return this.OsType;
    }

    /**
     * Set 系统类型(只支持32位)
     * @param OsType 系统类型(只支持32位)
     */
    public void setOsType(Long OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 终端分组id(只支持32位) 
     * @return GroupId 终端分组id(只支持32位)
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 终端分组id(只支持32位)
     * @param GroupId 终端分组id(只支持32位)
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 过滤条件、分页参数
<li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li> 
     * @return Condition 过滤条件、分页参数
<li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li>
     */
    public Condition getCondition() {
        return this.Condition;
    }

    /**
     * Set 过滤条件、分页参数
<li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li>
     * @param Condition 过滤条件、分页参数
<li>Name - String - 过滤支持：是 - 操作符:eq,like - 排序支持：是 。</li>
     */
    public void setCondition(Condition Condition) {
        this.Condition = Condition;
    }

    public DescribeDeviceDetailListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceDetailListRequest(DescribeDeviceDetailListRequest source) {
        if (source.OsType != null) {
            this.OsType = new Long(source.OsType);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Condition != null) {
            this.Condition = new Condition(source.Condition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamObj(map, prefix + "Condition.", this.Condition);

    }
}

