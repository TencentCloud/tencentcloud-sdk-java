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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOperationTaskRequest extends AbstractModel {

    /**
    * 运维任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 运维任务类型,1 - 手工执行, 2 - 周期性自动执行
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 执行账号
    */
    @SerializedName("Account")
    @Expose
    private String Account;

    /**
    * 超时时间,单位秒
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 执行脚本内容
    */
    @SerializedName("Script")
    @Expose
    private String Script;

    /**
    * 执行主机集合，满足条件以下三个条件：1. 资产绑定可用的专业版或国密版堡垒机服务；2、资产类型为linux资产；3、用户具有资产权限，且资产添加了指定执行账号
    */
    @SerializedName("DeviceIdSet")
    @Expose
    private Long [] DeviceIdSet;

    /**
    * 执行间隔，单位天. 手工执行时无需传入
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 首次执行日期 默认1970-01-01T08:00:01+08:00,手工执行时无需传入
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Script参数是否需要进行base64编码后传递，1-需要进行base64编码后传递，非1值-不需要进行base64编码后传递
    */
    @SerializedName("Encoding")
    @Expose
    private Long Encoding;

    /**
     * Get 运维任务名称 
     * @return Name 运维任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 运维任务名称
     * @param Name 运维任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 运维任务类型,1 - 手工执行, 2 - 周期性自动执行 
     * @return Type 运维任务类型,1 - 手工执行, 2 - 周期性自动执行
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 运维任务类型,1 - 手工执行, 2 - 周期性自动执行
     * @param Type 运维任务类型,1 - 手工执行, 2 - 周期性自动执行
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 执行账号 
     * @return Account 执行账号
     */
    public String getAccount() {
        return this.Account;
    }

    /**
     * Set 执行账号
     * @param Account 执行账号
     */
    public void setAccount(String Account) {
        this.Account = Account;
    }

    /**
     * Get 超时时间,单位秒 
     * @return Timeout 超时时间,单位秒
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时间,单位秒
     * @param Timeout 超时时间,单位秒
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 执行脚本内容 
     * @return Script 执行脚本内容
     */
    public String getScript() {
        return this.Script;
    }

    /**
     * Set 执行脚本内容
     * @param Script 执行脚本内容
     */
    public void setScript(String Script) {
        this.Script = Script;
    }

    /**
     * Get 执行主机集合，满足条件以下三个条件：1. 资产绑定可用的专业版或国密版堡垒机服务；2、资产类型为linux资产；3、用户具有资产权限，且资产添加了指定执行账号 
     * @return DeviceIdSet 执行主机集合，满足条件以下三个条件：1. 资产绑定可用的专业版或国密版堡垒机服务；2、资产类型为linux资产；3、用户具有资产权限，且资产添加了指定执行账号
     */
    public Long [] getDeviceIdSet() {
        return this.DeviceIdSet;
    }

    /**
     * Set 执行主机集合，满足条件以下三个条件：1. 资产绑定可用的专业版或国密版堡垒机服务；2、资产类型为linux资产；3、用户具有资产权限，且资产添加了指定执行账号
     * @param DeviceIdSet 执行主机集合，满足条件以下三个条件：1. 资产绑定可用的专业版或国密版堡垒机服务；2、资产类型为linux资产；3、用户具有资产权限，且资产添加了指定执行账号
     */
    public void setDeviceIdSet(Long [] DeviceIdSet) {
        this.DeviceIdSet = DeviceIdSet;
    }

    /**
     * Get 执行间隔，单位天. 手工执行时无需传入 
     * @return Period 执行间隔，单位天. 手工执行时无需传入
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 执行间隔，单位天. 手工执行时无需传入
     * @param Period 执行间隔，单位天. 手工执行时无需传入
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 首次执行日期 默认1970-01-01T08:00:01+08:00,手工执行时无需传入 
     * @return FirstTime 首次执行日期 默认1970-01-01T08:00:01+08:00,手工执行时无需传入
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 首次执行日期 默认1970-01-01T08:00:01+08:00,手工执行时无需传入
     * @param FirstTime 首次执行日期 默认1970-01-01T08:00:01+08:00,手工执行时无需传入
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Script参数是否需要进行base64编码后传递，1-需要进行base64编码后传递，非1值-不需要进行base64编码后传递 
     * @return Encoding Script参数是否需要进行base64编码后传递，1-需要进行base64编码后传递，非1值-不需要进行base64编码后传递
     */
    public Long getEncoding() {
        return this.Encoding;
    }

    /**
     * Set Script参数是否需要进行base64编码后传递，1-需要进行base64编码后传递，非1值-不需要进行base64编码后传递
     * @param Encoding Script参数是否需要进行base64编码后传递，1-需要进行base64编码后传递，非1值-不需要进行base64编码后传递
     */
    public void setEncoding(Long Encoding) {
        this.Encoding = Encoding;
    }

    public CreateOperationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOperationTaskRequest(CreateOperationTaskRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Account != null) {
            this.Account = new String(source.Account);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Script != null) {
            this.Script = new String(source.Script);
        }
        if (source.DeviceIdSet != null) {
            this.DeviceIdSet = new Long[source.DeviceIdSet.length];
            for (int i = 0; i < source.DeviceIdSet.length; i++) {
                this.DeviceIdSet[i] = new Long(source.DeviceIdSet[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.Encoding != null) {
            this.Encoding = new Long(source.Encoding);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Account", this.Account);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Script", this.Script);
        this.setParamArraySimple(map, prefix + "DeviceIdSet.", this.DeviceIdSet);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);

    }
}

