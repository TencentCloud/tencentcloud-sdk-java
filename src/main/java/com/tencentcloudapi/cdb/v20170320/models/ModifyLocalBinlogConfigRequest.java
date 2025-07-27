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

public class ModifyLocalBinlogConfigRequest extends AbstractModel {

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 本地 binlog 保留时长。不同实例的可取值如下：
1. 云盘版实例、双节点实例、三节点实例的本地 binlog 保留时长（小时）默认为120，范围：6 - 168。
2. 灾备实例的本地 binlog 保留时长（小时）默认为120，范围：120 - 168。
3. 单节点云盘实例的本地 binlog 保留时长（小时）默认为120，范围：0 - 168。
4. 若双节点实例、三节点实例下无灾备实例，则该主实例的本地 binlog 保留时长（小时）范围是：6 - 168；若双节点实例、三节点实例下有灾备实例，或者要为双节点实例、三节点实例添加灾备实例，为避免同步异常，该主实例的本地 binlog 保留时长（小时）不能设置低于120小时，范围是：120 - 168。
    */
    @SerializedName("SaveHours")
    @Expose
    private Long SaveHours;

    /**
    * 本地 binlog 空间使用率，可取值范围：[30,50]。
    */
    @SerializedName("MaxUsage")
    @Expose
    private Long MaxUsage;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 本地 binlog 保留时长。不同实例的可取值如下：
1. 云盘版实例、双节点实例、三节点实例的本地 binlog 保留时长（小时）默认为120，范围：6 - 168。
2. 灾备实例的本地 binlog 保留时长（小时）默认为120，范围：120 - 168。
3. 单节点云盘实例的本地 binlog 保留时长（小时）默认为120，范围：0 - 168。
4. 若双节点实例、三节点实例下无灾备实例，则该主实例的本地 binlog 保留时长（小时）范围是：6 - 168；若双节点实例、三节点实例下有灾备实例，或者要为双节点实例、三节点实例添加灾备实例，为避免同步异常，该主实例的本地 binlog 保留时长（小时）不能设置低于120小时，范围是：120 - 168。 
     * @return SaveHours 本地 binlog 保留时长。不同实例的可取值如下：
1. 云盘版实例、双节点实例、三节点实例的本地 binlog 保留时长（小时）默认为120，范围：6 - 168。
2. 灾备实例的本地 binlog 保留时长（小时）默认为120，范围：120 - 168。
3. 单节点云盘实例的本地 binlog 保留时长（小时）默认为120，范围：0 - 168。
4. 若双节点实例、三节点实例下无灾备实例，则该主实例的本地 binlog 保留时长（小时）范围是：6 - 168；若双节点实例、三节点实例下有灾备实例，或者要为双节点实例、三节点实例添加灾备实例，为避免同步异常，该主实例的本地 binlog 保留时长（小时）不能设置低于120小时，范围是：120 - 168。
     */
    public Long getSaveHours() {
        return this.SaveHours;
    }

    /**
     * Set 本地 binlog 保留时长。不同实例的可取值如下：
1. 云盘版实例、双节点实例、三节点实例的本地 binlog 保留时长（小时）默认为120，范围：6 - 168。
2. 灾备实例的本地 binlog 保留时长（小时）默认为120，范围：120 - 168。
3. 单节点云盘实例的本地 binlog 保留时长（小时）默认为120，范围：0 - 168。
4. 若双节点实例、三节点实例下无灾备实例，则该主实例的本地 binlog 保留时长（小时）范围是：6 - 168；若双节点实例、三节点实例下有灾备实例，或者要为双节点实例、三节点实例添加灾备实例，为避免同步异常，该主实例的本地 binlog 保留时长（小时）不能设置低于120小时，范围是：120 - 168。
     * @param SaveHours 本地 binlog 保留时长。不同实例的可取值如下：
1. 云盘版实例、双节点实例、三节点实例的本地 binlog 保留时长（小时）默认为120，范围：6 - 168。
2. 灾备实例的本地 binlog 保留时长（小时）默认为120，范围：120 - 168。
3. 单节点云盘实例的本地 binlog 保留时长（小时）默认为120，范围：0 - 168。
4. 若双节点实例、三节点实例下无灾备实例，则该主实例的本地 binlog 保留时长（小时）范围是：6 - 168；若双节点实例、三节点实例下有灾备实例，或者要为双节点实例、三节点实例添加灾备实例，为避免同步异常，该主实例的本地 binlog 保留时长（小时）不能设置低于120小时，范围是：120 - 168。
     */
    public void setSaveHours(Long SaveHours) {
        this.SaveHours = SaveHours;
    }

    /**
     * Get 本地 binlog 空间使用率，可取值范围：[30,50]。 
     * @return MaxUsage 本地 binlog 空间使用率，可取值范围：[30,50]。
     */
    public Long getMaxUsage() {
        return this.MaxUsage;
    }

    /**
     * Set 本地 binlog 空间使用率，可取值范围：[30,50]。
     * @param MaxUsage 本地 binlog 空间使用率，可取值范围：[30,50]。
     */
    public void setMaxUsage(Long MaxUsage) {
        this.MaxUsage = MaxUsage;
    }

    public ModifyLocalBinlogConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLocalBinlogConfigRequest(ModifyLocalBinlogConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SaveHours != null) {
            this.SaveHours = new Long(source.SaveHours);
        }
        if (source.MaxUsage != null) {
            this.MaxUsage = new Long(source.MaxUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SaveHours", this.SaveHours);
        this.setParamSimple(map, prefix + "MaxUsage", this.MaxUsage);

    }
}

