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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MakePlanAlarmRule extends AbstractModel {

    /**
    * 告警的级别
1 -- 普通
2 -- 重要
3 -- 紧急
    */
    @SerializedName("AlarmLevel")
    @Expose
    private Long AlarmLevel;

    /**
    * 告警的类型，补录计划支持：
start：启动告警
failure：失败告警
success：成功告警
overtime：超过配置时间告警

    */
    @SerializedName("AlarmTypes")
    @Expose
    private String [] AlarmTypes;

    /**
    * 告警超时时间
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * 告警接受人 升级人配置信息
    */
    @SerializedName("AlarmGroup")
    @Expose
    private AlarmGroup [] AlarmGroup;

    /**
     * Get 告警的级别
1 -- 普通
2 -- 重要
3 -- 紧急 
     * @return AlarmLevel 告警的级别
1 -- 普通
2 -- 重要
3 -- 紧急
     */
    public Long getAlarmLevel() {
        return this.AlarmLevel;
    }

    /**
     * Set 告警的级别
1 -- 普通
2 -- 重要
3 -- 紧急
     * @param AlarmLevel 告警的级别
1 -- 普通
2 -- 重要
3 -- 紧急
     */
    public void setAlarmLevel(Long AlarmLevel) {
        this.AlarmLevel = AlarmLevel;
    }

    /**
     * Get 告警的类型，补录计划支持：
start：启动告警
failure：失败告警
success：成功告警
overtime：超过配置时间告警
 
     * @return AlarmTypes 告警的类型，补录计划支持：
start：启动告警
failure：失败告警
success：成功告警
overtime：超过配置时间告警

     */
    public String [] getAlarmTypes() {
        return this.AlarmTypes;
    }

    /**
     * Set 告警的类型，补录计划支持：
start：启动告警
failure：失败告警
success：成功告警
overtime：超过配置时间告警

     * @param AlarmTypes 告警的类型，补录计划支持：
start：启动告警
failure：失败告警
success：成功告警
overtime：超过配置时间告警

     */
    public void setAlarmTypes(String [] AlarmTypes) {
        this.AlarmTypes = AlarmTypes;
    }

    /**
     * Get 告警超时时间 
     * @return ExtInfo 告警超时时间
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 告警超时时间
     * @param ExtInfo 告警超时时间
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get 告警接受人 升级人配置信息 
     * @return AlarmGroup 告警接受人 升级人配置信息
     */
    public AlarmGroup [] getAlarmGroup() {
        return this.AlarmGroup;
    }

    /**
     * Set 告警接受人 升级人配置信息
     * @param AlarmGroup 告警接受人 升级人配置信息
     */
    public void setAlarmGroup(AlarmGroup [] AlarmGroup) {
        this.AlarmGroup = AlarmGroup;
    }

    public MakePlanAlarmRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MakePlanAlarmRule(MakePlanAlarmRule source) {
        if (source.AlarmLevel != null) {
            this.AlarmLevel = new Long(source.AlarmLevel);
        }
        if (source.AlarmTypes != null) {
            this.AlarmTypes = new String[source.AlarmTypes.length];
            for (int i = 0; i < source.AlarmTypes.length; i++) {
                this.AlarmTypes[i] = new String(source.AlarmTypes[i]);
            }
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.AlarmGroup != null) {
            this.AlarmGroup = new AlarmGroup[source.AlarmGroup.length];
            for (int i = 0; i < source.AlarmGroup.length; i++) {
                this.AlarmGroup[i] = new AlarmGroup(source.AlarmGroup[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmLevel", this.AlarmLevel);
        this.setParamArraySimple(map, prefix + "AlarmTypes.", this.AlarmTypes);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamArrayObj(map, prefix + "AlarmGroup.", this.AlarmGroup);

    }
}

