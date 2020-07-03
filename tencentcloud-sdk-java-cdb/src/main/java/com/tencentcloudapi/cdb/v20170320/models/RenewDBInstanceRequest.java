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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewDBInstanceRequest extends AbstractModel{

    /**
    * 待续费的实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872)。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 续费时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 如果需要将按量计费实例续费为包年包月的实例，该入参的值需要指定为 "PREPAID" 。
    */
    @SerializedName("ModifyPayType")
    @Expose
    private String ModifyPayType;

    /**
     * Get 待续费的实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872)。 
     * @return InstanceId 待续费的实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872)。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 待续费的实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872)。
     * @param InstanceId 待续费的实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同，可使用 [查询实例列表](https://cloud.tencent.com/document/api/236/15872)。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 续费时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。 
     * @return TimeSpan 续费时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 续费时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
     * @param TimeSpan 续费时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 如果需要将按量计费实例续费为包年包月的实例，该入参的值需要指定为 "PREPAID" 。 
     * @return ModifyPayType 如果需要将按量计费实例续费为包年包月的实例，该入参的值需要指定为 "PREPAID" 。
     */
    public String getModifyPayType() {
        return this.ModifyPayType;
    }

    /**
     * Set 如果需要将按量计费实例续费为包年包月的实例，该入参的值需要指定为 "PREPAID" 。
     * @param ModifyPayType 如果需要将按量计费实例续费为包年包月的实例，该入参的值需要指定为 "PREPAID" 。
     */
    public void setModifyPayType(String ModifyPayType) {
        this.ModifyPayType = ModifyPayType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "ModifyPayType", this.ModifyPayType);

    }
}

