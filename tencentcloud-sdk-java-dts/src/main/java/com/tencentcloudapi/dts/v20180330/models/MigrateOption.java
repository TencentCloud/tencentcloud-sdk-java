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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateOption extends AbstractModel{

    /**
    * 任务运行模式，值包括：1-立即执行，2-定时执行
    */
    @SerializedName("RunMode")
    @Expose
    private Long RunMode;

    /**
    * 期望执行时间，当runMode=2时，该字段必填，时间格式：yyyy-mm-dd hh:mm:ss
    */
    @SerializedName("ExpectTime")
    @Expose
    private String ExpectTime;

    /**
    * 数据迁移类型，值包括：1-结构迁移,2-全量迁移,3-全量+增量迁移
    */
    @SerializedName("MigrateType")
    @Expose
    private Long MigrateType;

    /**
    * 迁移对象，1-整个实例，2-指定库表
    */
    @SerializedName("MigrateObject")
    @Expose
    private Long MigrateObject;

    /**
    * 抽样数据一致性检测参数，1-未配置,2-全量检测,3-抽样检测, 4-仅校验不一致表,5-不检测
    */
    @SerializedName("ConsistencyType")
    @Expose
    private Long ConsistencyType;

    /**
    * 是否用源库Root账户覆盖目标库，值包括：0-不覆盖，1-覆盖，选择库表或者结构迁移时应该为0
    */
    @SerializedName("IsOverrideRoot")
    @Expose
    private Long IsOverrideRoot;

    /**
    * 不同数据库用到的额外参数.以JSON格式描述. 
Redis可定义如下的参数: 
{ 
	"ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 
	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 
	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 
	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 
	"ReplTimeout":120，		复制超时时间(秒) 
}
MongoDB可定义如下的参数: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
MySQL暂不支持额外参数设置。
    */
    @SerializedName("ExternParams")
    @Expose
    private String ExternParams;

    /**
    * 仅用于“抽样数据一致性检测”，ConsistencyType配置为抽样检测时，必选
    */
    @SerializedName("ConsistencyParams")
    @Expose
    private ConsistencyParams ConsistencyParams;

    /**
     * Get 任务运行模式，值包括：1-立即执行，2-定时执行 
     * @return RunMode 任务运行模式，值包括：1-立即执行，2-定时执行
     */
    public Long getRunMode() {
        return this.RunMode;
    }

    /**
     * Set 任务运行模式，值包括：1-立即执行，2-定时执行
     * @param RunMode 任务运行模式，值包括：1-立即执行，2-定时执行
     */
    public void setRunMode(Long RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get 期望执行时间，当runMode=2时，该字段必填，时间格式：yyyy-mm-dd hh:mm:ss 
     * @return ExpectTime 期望执行时间，当runMode=2时，该字段必填，时间格式：yyyy-mm-dd hh:mm:ss
     */
    public String getExpectTime() {
        return this.ExpectTime;
    }

    /**
     * Set 期望执行时间，当runMode=2时，该字段必填，时间格式：yyyy-mm-dd hh:mm:ss
     * @param ExpectTime 期望执行时间，当runMode=2时，该字段必填，时间格式：yyyy-mm-dd hh:mm:ss
     */
    public void setExpectTime(String ExpectTime) {
        this.ExpectTime = ExpectTime;
    }

    /**
     * Get 数据迁移类型，值包括：1-结构迁移,2-全量迁移,3-全量+增量迁移 
     * @return MigrateType 数据迁移类型，值包括：1-结构迁移,2-全量迁移,3-全量+增量迁移
     */
    public Long getMigrateType() {
        return this.MigrateType;
    }

    /**
     * Set 数据迁移类型，值包括：1-结构迁移,2-全量迁移,3-全量+增量迁移
     * @param MigrateType 数据迁移类型，值包括：1-结构迁移,2-全量迁移,3-全量+增量迁移
     */
    public void setMigrateType(Long MigrateType) {
        this.MigrateType = MigrateType;
    }

    /**
     * Get 迁移对象，1-整个实例，2-指定库表 
     * @return MigrateObject 迁移对象，1-整个实例，2-指定库表
     */
    public Long getMigrateObject() {
        return this.MigrateObject;
    }

    /**
     * Set 迁移对象，1-整个实例，2-指定库表
     * @param MigrateObject 迁移对象，1-整个实例，2-指定库表
     */
    public void setMigrateObject(Long MigrateObject) {
        this.MigrateObject = MigrateObject;
    }

    /**
     * Get 抽样数据一致性检测参数，1-未配置,2-全量检测,3-抽样检测, 4-仅校验不一致表,5-不检测 
     * @return ConsistencyType 抽样数据一致性检测参数，1-未配置,2-全量检测,3-抽样检测, 4-仅校验不一致表,5-不检测
     */
    public Long getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set 抽样数据一致性检测参数，1-未配置,2-全量检测,3-抽样检测, 4-仅校验不一致表,5-不检测
     * @param ConsistencyType 抽样数据一致性检测参数，1-未配置,2-全量检测,3-抽样检测, 4-仅校验不一致表,5-不检测
     */
    public void setConsistencyType(Long ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Get 是否用源库Root账户覆盖目标库，值包括：0-不覆盖，1-覆盖，选择库表或者结构迁移时应该为0 
     * @return IsOverrideRoot 是否用源库Root账户覆盖目标库，值包括：0-不覆盖，1-覆盖，选择库表或者结构迁移时应该为0
     */
    public Long getIsOverrideRoot() {
        return this.IsOverrideRoot;
    }

    /**
     * Set 是否用源库Root账户覆盖目标库，值包括：0-不覆盖，1-覆盖，选择库表或者结构迁移时应该为0
     * @param IsOverrideRoot 是否用源库Root账户覆盖目标库，值包括：0-不覆盖，1-覆盖，选择库表或者结构迁移时应该为0
     */
    public void setIsOverrideRoot(Long IsOverrideRoot) {
        this.IsOverrideRoot = IsOverrideRoot;
    }

    /**
     * Get 不同数据库用到的额外参数.以JSON格式描述. 
Redis可定义如下的参数: 
{ 
	"ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 
	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 
	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 
	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 
	"ReplTimeout":120，		复制超时时间(秒) 
}
MongoDB可定义如下的参数: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
MySQL暂不支持额外参数设置。 
     * @return ExternParams 不同数据库用到的额外参数.以JSON格式描述. 
Redis可定义如下的参数: 
{ 
	"ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 
	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 
	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 
	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 
	"ReplTimeout":120，		复制超时时间(秒) 
}
MongoDB可定义如下的参数: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
MySQL暂不支持额外参数设置。
     */
    public String getExternParams() {
        return this.ExternParams;
    }

    /**
     * Set 不同数据库用到的额外参数.以JSON格式描述. 
Redis可定义如下的参数: 
{ 
	"ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 
	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 
	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 
	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 
	"ReplTimeout":120，		复制超时时间(秒) 
}
MongoDB可定义如下的参数: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
MySQL暂不支持额外参数设置。
     * @param ExternParams 不同数据库用到的额外参数.以JSON格式描述. 
Redis可定义如下的参数: 
{ 
	"ClientOutputBufferHardLimit":512, 	从机缓冲区的硬性容量限制(MB) 
	"ClientOutputBufferSoftLimit":512, 	从机缓冲区的软性容量限制(MB) 
	"ClientOutputBufferPersistTime":60, 从机缓冲区的软性限制持续时间(秒) 
	"ReplBacklogSize":512, 	环形缓冲区容量限制(MB) 
	"ReplTimeout":120，		复制超时时间(秒) 
}
MongoDB可定义如下的参数: 
{
	'SrcAuthDatabase':'admin', 
	'SrcAuthFlag': "1", 
	'SrcAuthMechanism':"SCRAM-SHA-1"
}
MySQL暂不支持额外参数设置。
     */
    public void setExternParams(String ExternParams) {
        this.ExternParams = ExternParams;
    }

    /**
     * Get 仅用于“抽样数据一致性检测”，ConsistencyType配置为抽样检测时，必选 
     * @return ConsistencyParams 仅用于“抽样数据一致性检测”，ConsistencyType配置为抽样检测时，必选
     */
    public ConsistencyParams getConsistencyParams() {
        return this.ConsistencyParams;
    }

    /**
     * Set 仅用于“抽样数据一致性检测”，ConsistencyType配置为抽样检测时，必选
     * @param ConsistencyParams 仅用于“抽样数据一致性检测”，ConsistencyType配置为抽样检测时，必选
     */
    public void setConsistencyParams(ConsistencyParams ConsistencyParams) {
        this.ConsistencyParams = ConsistencyParams;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ExpectTime", this.ExpectTime);
        this.setParamSimple(map, prefix + "MigrateType", this.MigrateType);
        this.setParamSimple(map, prefix + "MigrateObject", this.MigrateObject);
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);
        this.setParamSimple(map, prefix + "IsOverrideRoot", this.IsOverrideRoot);
        this.setParamSimple(map, prefix + "ExternParams", this.ExternParams);
        this.setParamObj(map, prefix + "ConsistencyParams.", this.ConsistencyParams);

    }
}

