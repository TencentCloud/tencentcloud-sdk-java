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

public class TaskTypeDsVO extends AbstractModel {

    /**
    * 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * TypeDesc描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeDesc")
    @Expose
    private String TypeDesc;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 服务器类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServerType")
    @Expose
    private String SourceServerType;

    /**
    * 目标服务器类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetServerType")
    @Expose
    private String TargetServerType;

    /**
    * RunJarName名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunJarName")
    @Expose
    private String RunJarName;

    /**
    * Killable参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KillAble")
    @Expose
    private Long KillAble;

    /**
    * TypeSort类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeSort")
    @Expose
    private String TypeSort;

    /**
    * InCharge参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 节点对应任务类型运行上限（暂时不考虑）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerParallelism")
    @Expose
    private Long BrokerParallelism;

    /**
    * 每个任务运行上限（暂时不考虑
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskParallelism")
    @Expose
    private Long TaskParallelism;

    /**
    * 补录和重跑上限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DoRedoParallelism")
    @Expose
    private Long DoRedoParallelism;

    /**
    * 0 为不可创建任务; >0 可创建任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DowngradePriorityTries")
    @Expose
    private Long DowngradePriorityTries;

    /**
    * 重试等待时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryWait")
    @Expose
    private Long RetryWait;

    /**
    * 重试次数（在任务属性配置中设置）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryLimit")
    @Expose
    private Long RetryLimit;

    /**
    * DefaultAliveWait参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultAliveWait")
    @Expose
    private Long DefaultAliveWait;

    /**
    * PollingSeconds秒数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PollingSeconds")
    @Expose
    private Long PollingSeconds;

    /**
    * 参数列表xml
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamList")
    @Expose
    private String ParamList;

    /**
    * TaskTypeExts参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeExtension")
    @Expose
    private TaskTypeExtParamDsVO [] TaskTypeExtension;

    /**
    * 对应文件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 是否选择脚本路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelectFilePath")
    @Expose
    private Boolean SelectFilePath;

    /**
    * classpath是否要排除掉common-lib，默认是0不排除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludeCommonLib")
    @Expose
    private Boolean ExcludeCommonLib;

    /**
    * runner任务完成后需要触发的hook
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostHooks")
    @Expose
    private String PostHooks;

    /**
     * Get 任务类型id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeId 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeId 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get TypeDesc描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeDesc TypeDesc描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTypeDesc() {
        return this.TypeDesc;
    }

    /**
     * Set TypeDesc描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeDesc TypeDesc描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeDesc(String TypeDesc) {
        this.TypeDesc = TypeDesc;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 服务器类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServerType 服务器类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServerType() {
        return this.SourceServerType;
    }

    /**
     * Set 服务器类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServerType 服务器类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServerType(String SourceServerType) {
        this.SourceServerType = SourceServerType;
    }

    /**
     * Get 目标服务器类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetServerType 目标服务器类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetServerType() {
        return this.TargetServerType;
    }

    /**
     * Set 目标服务器类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetServerType 目标服务器类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetServerType(String TargetServerType) {
        this.TargetServerType = TargetServerType;
    }

    /**
     * Get RunJarName名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunJarName RunJarName名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunJarName() {
        return this.RunJarName;
    }

    /**
     * Set RunJarName名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunJarName RunJarName名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunJarName(String RunJarName) {
        this.RunJarName = RunJarName;
    }

    /**
     * Get Killable参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KillAble Killable参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getKillAble() {
        return this.KillAble;
    }

    /**
     * Set Killable参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param KillAble Killable参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKillAble(Long KillAble) {
        this.KillAble = KillAble;
    }

    /**
     * Get TypeSort类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeSort TypeSort类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTypeSort() {
        return this.TypeSort;
    }

    /**
     * Set TypeSort类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeSort TypeSort类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeSort(String TypeSort) {
        this.TypeSort = TypeSort;
    }

    /**
     * Get InCharge参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge InCharge参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set InCharge参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge InCharge参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 节点对应任务类型运行上限（暂时不考虑）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerParallelism 节点对应任务类型运行上限（暂时不考虑）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBrokerParallelism() {
        return this.BrokerParallelism;
    }

    /**
     * Set 节点对应任务类型运行上限（暂时不考虑）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerParallelism 节点对应任务类型运行上限（暂时不考虑）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerParallelism(Long BrokerParallelism) {
        this.BrokerParallelism = BrokerParallelism;
    }

    /**
     * Get 每个任务运行上限（暂时不考虑
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskParallelism 每个任务运行上限（暂时不考虑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskParallelism() {
        return this.TaskParallelism;
    }

    /**
     * Set 每个任务运行上限（暂时不考虑
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskParallelism 每个任务运行上限（暂时不考虑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskParallelism(Long TaskParallelism) {
        this.TaskParallelism = TaskParallelism;
    }

    /**
     * Get 补录和重跑上限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DoRedoParallelism 补录和重跑上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDoRedoParallelism() {
        return this.DoRedoParallelism;
    }

    /**
     * Set 补录和重跑上限
注意：此字段可能返回 null，表示取不到有效值。
     * @param DoRedoParallelism 补录和重跑上限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDoRedoParallelism(Long DoRedoParallelism) {
        this.DoRedoParallelism = DoRedoParallelism;
    }

    /**
     * Get 0 为不可创建任务; >0 可创建任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DowngradePriorityTries 0 为不可创建任务; >0 可创建任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDowngradePriorityTries() {
        return this.DowngradePriorityTries;
    }

    /**
     * Set 0 为不可创建任务; >0 可创建任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param DowngradePriorityTries 0 为不可创建任务; >0 可创建任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDowngradePriorityTries(Long DowngradePriorityTries) {
        this.DowngradePriorityTries = DowngradePriorityTries;
    }

    /**
     * Get 重试等待时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryWait 重试等待时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryWait() {
        return this.RetryWait;
    }

    /**
     * Set 重试等待时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryWait 重试等待时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryWait(Long RetryWait) {
        this.RetryWait = RetryWait;
    }

    /**
     * Get 重试次数（在任务属性配置中设置）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryLimit 重试次数（在任务属性配置中设置）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryLimit() {
        return this.RetryLimit;
    }

    /**
     * Set 重试次数（在任务属性配置中设置）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryLimit 重试次数（在任务属性配置中设置）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryLimit(Long RetryLimit) {
        this.RetryLimit = RetryLimit;
    }

    /**
     * Get DefaultAliveWait参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultAliveWait DefaultAliveWait参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefaultAliveWait() {
        return this.DefaultAliveWait;
    }

    /**
     * Set DefaultAliveWait参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultAliveWait DefaultAliveWait参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultAliveWait(Long DefaultAliveWait) {
        this.DefaultAliveWait = DefaultAliveWait;
    }

    /**
     * Get PollingSeconds秒数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PollingSeconds PollingSeconds秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPollingSeconds() {
        return this.PollingSeconds;
    }

    /**
     * Set PollingSeconds秒数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PollingSeconds PollingSeconds秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPollingSeconds(Long PollingSeconds) {
        this.PollingSeconds = PollingSeconds;
    }

    /**
     * Get 参数列表xml
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamList 参数列表xml
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamList() {
        return this.ParamList;
    }

    /**
     * Set 参数列表xml
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamList 参数列表xml
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamList(String ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * Get TaskTypeExts参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeExtension TaskTypeExts参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskTypeExtParamDsVO [] getTaskTypeExtension() {
        return this.TaskTypeExtension;
    }

    /**
     * Set TaskTypeExts参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeExtension TaskTypeExts参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeExtension(TaskTypeExtParamDsVO [] TaskTypeExtension) {
        this.TaskTypeExtension = TaskTypeExtension;
    }

    /**
     * Get 对应文件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileType 对应文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 对应文件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileType 对应文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 是否选择脚本路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelectFilePath 是否选择脚本路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSelectFilePath() {
        return this.SelectFilePath;
    }

    /**
     * Set 是否选择脚本路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelectFilePath 是否选择脚本路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectFilePath(Boolean SelectFilePath) {
        this.SelectFilePath = SelectFilePath;
    }

    /**
     * Get classpath是否要排除掉common-lib，默认是0不排除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludeCommonLib classpath是否要排除掉common-lib，默认是0不排除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getExcludeCommonLib() {
        return this.ExcludeCommonLib;
    }

    /**
     * Set classpath是否要排除掉common-lib，默认是0不排除
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludeCommonLib classpath是否要排除掉common-lib，默认是0不排除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludeCommonLib(Boolean ExcludeCommonLib) {
        this.ExcludeCommonLib = ExcludeCommonLib;
    }

    /**
     * Get runner任务完成后需要触发的hook
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostHooks runner任务完成后需要触发的hook
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPostHooks() {
        return this.PostHooks;
    }

    /**
     * Set runner任务完成后需要触发的hook
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostHooks runner任务完成后需要触发的hook
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostHooks(String PostHooks) {
        this.PostHooks = PostHooks;
    }

    public TaskTypeDsVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTypeDsVO(TaskTypeDsVO source) {
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.TypeDesc != null) {
            this.TypeDesc = new String(source.TypeDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SourceServerType != null) {
            this.SourceServerType = new String(source.SourceServerType);
        }
        if (source.TargetServerType != null) {
            this.TargetServerType = new String(source.TargetServerType);
        }
        if (source.RunJarName != null) {
            this.RunJarName = new String(source.RunJarName);
        }
        if (source.KillAble != null) {
            this.KillAble = new Long(source.KillAble);
        }
        if (source.TypeSort != null) {
            this.TypeSort = new String(source.TypeSort);
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.BrokerParallelism != null) {
            this.BrokerParallelism = new Long(source.BrokerParallelism);
        }
        if (source.TaskParallelism != null) {
            this.TaskParallelism = new Long(source.TaskParallelism);
        }
        if (source.DoRedoParallelism != null) {
            this.DoRedoParallelism = new Long(source.DoRedoParallelism);
        }
        if (source.DowngradePriorityTries != null) {
            this.DowngradePriorityTries = new Long(source.DowngradePriorityTries);
        }
        if (source.RetryWait != null) {
            this.RetryWait = new Long(source.RetryWait);
        }
        if (source.RetryLimit != null) {
            this.RetryLimit = new Long(source.RetryLimit);
        }
        if (source.DefaultAliveWait != null) {
            this.DefaultAliveWait = new Long(source.DefaultAliveWait);
        }
        if (source.PollingSeconds != null) {
            this.PollingSeconds = new Long(source.PollingSeconds);
        }
        if (source.ParamList != null) {
            this.ParamList = new String(source.ParamList);
        }
        if (source.TaskTypeExtension != null) {
            this.TaskTypeExtension = new TaskTypeExtParamDsVO[source.TaskTypeExtension.length];
            for (int i = 0; i < source.TaskTypeExtension.length; i++) {
                this.TaskTypeExtension[i] = new TaskTypeExtParamDsVO(source.TaskTypeExtension[i]);
            }
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.SelectFilePath != null) {
            this.SelectFilePath = new Boolean(source.SelectFilePath);
        }
        if (source.ExcludeCommonLib != null) {
            this.ExcludeCommonLib = new Boolean(source.ExcludeCommonLib);
        }
        if (source.PostHooks != null) {
            this.PostHooks = new String(source.PostHooks);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "TypeDesc", this.TypeDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SourceServerType", this.SourceServerType);
        this.setParamSimple(map, prefix + "TargetServerType", this.TargetServerType);
        this.setParamSimple(map, prefix + "RunJarName", this.RunJarName);
        this.setParamSimple(map, prefix + "KillAble", this.KillAble);
        this.setParamSimple(map, prefix + "TypeSort", this.TypeSort);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "BrokerParallelism", this.BrokerParallelism);
        this.setParamSimple(map, prefix + "TaskParallelism", this.TaskParallelism);
        this.setParamSimple(map, prefix + "DoRedoParallelism", this.DoRedoParallelism);
        this.setParamSimple(map, prefix + "DowngradePriorityTries", this.DowngradePriorityTries);
        this.setParamSimple(map, prefix + "RetryWait", this.RetryWait);
        this.setParamSimple(map, prefix + "RetryLimit", this.RetryLimit);
        this.setParamSimple(map, prefix + "DefaultAliveWait", this.DefaultAliveWait);
        this.setParamSimple(map, prefix + "PollingSeconds", this.PollingSeconds);
        this.setParamSimple(map, prefix + "ParamList", this.ParamList);
        this.setParamArrayObj(map, prefix + "TaskTypeExtension.", this.TaskTypeExtension);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "SelectFilePath", this.SelectFilePath);
        this.setParamSimple(map, prefix + "ExcludeCommonLib", this.ExcludeCommonLib);
        this.setParamSimple(map, prefix + "PostHooks", this.PostHooks);

    }
}

