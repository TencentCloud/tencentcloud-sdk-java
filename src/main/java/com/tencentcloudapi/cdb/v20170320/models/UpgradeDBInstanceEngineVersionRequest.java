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

public class UpgradeDBInstanceEngineVersionRequest extends AbstractModel {

    /**
    * <p>实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主实例数据库引擎版本，支持值包括：5.6、5.7、8.0。<br>说明：不支持越级升级，升级后不支持降级。</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 <a href="https://cloud.tencent.com/document/product/236/15864">切换访问新实例</a> 触发该流程。</p>
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Long WaitSwitch;

    /**
    * <p>是否是内核子版本升级，支持的值：1 - 升级内核子版本；0 - 升级数据库引擎版本。无默认值，请指定要升级的版本类型。</p>
    */
    @SerializedName("UpgradeSubversion")
    @Expose
    private Long UpgradeSubversion;

    /**
    * <p>延迟阈值。取值范围：1 - 10。无默认值，不传此参数时，延迟阈值为0，表示延迟阈值不做设置。</p>
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private Long MaxDelayTime;

    /**
    * <p>5.7升级8.0是否忽略关键字错误，取值范围[0,1]，1表示忽略，0表示不忽略。无默认值，不传此参数表示不做处理。</p>
    */
    @SerializedName("IgnoreErrKeyword")
    @Expose
    private Long IgnoreErrKeyword;

    /**
    * <p>版本升级支持指定参数</p>
    */
    @SerializedName("ParamList")
    @Expose
    private UpgradeEngineVersionParams [] ParamList;

    /**
     * Get <p>实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。</p> 
     * @return InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。</p>
     * @param InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同，可使用 <a href="https://cloud.tencent.com/document/api/236/15872">查询实例列表</a> 接口获取，其值为输出参数中字段 InstanceId 的值。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主实例数据库引擎版本，支持值包括：5.6、5.7、8.0。<br>说明：不支持越级升级，升级后不支持降级。</p> 
     * @return EngineVersion <p>主实例数据库引擎版本，支持值包括：5.6、5.7、8.0。<br>说明：不支持越级升级，升级后不支持降级。</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>主实例数据库引擎版本，支持值包括：5.6、5.7、8.0。<br>说明：不支持越级升级，升级后不支持降级。</p>
     * @param EngineVersion <p>主实例数据库引擎版本，支持值包括：5.6、5.7、8.0。<br>说明：不支持越级升级，升级后不支持降级。</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 <a href="https://cloud.tencent.com/document/product/236/15864">切换访问新实例</a> 触发该流程。</p> 
     * @return WaitSwitch <p>切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 <a href="https://cloud.tencent.com/document/product/236/15864">切换访问新实例</a> 触发该流程。</p>
     */
    public Long getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set <p>切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 <a href="https://cloud.tencent.com/document/product/236/15864">切换访问新实例</a> 触发该流程。</p>
     * @param WaitSwitch <p>切换访问新实例的方式，默认为 0。支持值包括：0 - 立刻切换，1 - 时间窗切换；当该值为 1 时，升级过程中，切换访问新实例的流程将会在时间窗内进行，或者用户主动调用接口 <a href="https://cloud.tencent.com/document/product/236/15864">切换访问新实例</a> 触发该流程。</p>
     */
    public void setWaitSwitch(Long WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    /**
     * Get <p>是否是内核子版本升级，支持的值：1 - 升级内核子版本；0 - 升级数据库引擎版本。无默认值，请指定要升级的版本类型。</p> 
     * @return UpgradeSubversion <p>是否是内核子版本升级，支持的值：1 - 升级内核子版本；0 - 升级数据库引擎版本。无默认值，请指定要升级的版本类型。</p>
     */
    public Long getUpgradeSubversion() {
        return this.UpgradeSubversion;
    }

    /**
     * Set <p>是否是内核子版本升级，支持的值：1 - 升级内核子版本；0 - 升级数据库引擎版本。无默认值，请指定要升级的版本类型。</p>
     * @param UpgradeSubversion <p>是否是内核子版本升级，支持的值：1 - 升级内核子版本；0 - 升级数据库引擎版本。无默认值，请指定要升级的版本类型。</p>
     */
    public void setUpgradeSubversion(Long UpgradeSubversion) {
        this.UpgradeSubversion = UpgradeSubversion;
    }

    /**
     * Get <p>延迟阈值。取值范围：1 - 10。无默认值，不传此参数时，延迟阈值为0，表示延迟阈值不做设置。</p> 
     * @return MaxDelayTime <p>延迟阈值。取值范围：1 - 10。无默认值，不传此参数时，延迟阈值为0，表示延迟阈值不做设置。</p>
     */
    public Long getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set <p>延迟阈值。取值范围：1 - 10。无默认值，不传此参数时，延迟阈值为0，表示延迟阈值不做设置。</p>
     * @param MaxDelayTime <p>延迟阈值。取值范围：1 - 10。无默认值，不传此参数时，延迟阈值为0，表示延迟阈值不做设置。</p>
     */
    public void setMaxDelayTime(Long MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    /**
     * Get <p>5.7升级8.0是否忽略关键字错误，取值范围[0,1]，1表示忽略，0表示不忽略。无默认值，不传此参数表示不做处理。</p> 
     * @return IgnoreErrKeyword <p>5.7升级8.0是否忽略关键字错误，取值范围[0,1]，1表示忽略，0表示不忽略。无默认值，不传此参数表示不做处理。</p>
     */
    public Long getIgnoreErrKeyword() {
        return this.IgnoreErrKeyword;
    }

    /**
     * Set <p>5.7升级8.0是否忽略关键字错误，取值范围[0,1]，1表示忽略，0表示不忽略。无默认值，不传此参数表示不做处理。</p>
     * @param IgnoreErrKeyword <p>5.7升级8.0是否忽略关键字错误，取值范围[0,1]，1表示忽略，0表示不忽略。无默认值，不传此参数表示不做处理。</p>
     */
    public void setIgnoreErrKeyword(Long IgnoreErrKeyword) {
        this.IgnoreErrKeyword = IgnoreErrKeyword;
    }

    /**
     * Get <p>版本升级支持指定参数</p> 
     * @return ParamList <p>版本升级支持指定参数</p>
     */
    public UpgradeEngineVersionParams [] getParamList() {
        return this.ParamList;
    }

    /**
     * Set <p>版本升级支持指定参数</p>
     * @param ParamList <p>版本升级支持指定参数</p>
     */
    public void setParamList(UpgradeEngineVersionParams [] ParamList) {
        this.ParamList = ParamList;
    }

    public UpgradeDBInstanceEngineVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDBInstanceEngineVersionRequest(UpgradeDBInstanceEngineVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Long(source.WaitSwitch);
        }
        if (source.UpgradeSubversion != null) {
            this.UpgradeSubversion = new Long(source.UpgradeSubversion);
        }
        if (source.MaxDelayTime != null) {
            this.MaxDelayTime = new Long(source.MaxDelayTime);
        }
        if (source.IgnoreErrKeyword != null) {
            this.IgnoreErrKeyword = new Long(source.IgnoreErrKeyword);
        }
        if (source.ParamList != null) {
            this.ParamList = new UpgradeEngineVersionParams[source.ParamList.length];
            for (int i = 0; i < source.ParamList.length; i++) {
                this.ParamList[i] = new UpgradeEngineVersionParams(source.ParamList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);
        this.setParamSimple(map, prefix + "UpgradeSubversion", this.UpgradeSubversion);
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);
        this.setParamSimple(map, prefix + "IgnoreErrKeyword", this.IgnoreErrKeyword);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

