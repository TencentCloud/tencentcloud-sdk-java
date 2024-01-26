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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomizeBusinessEntityDTO extends AbstractModel {

    /**
    * taskId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * taskName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * taskType
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Type
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * runUrl
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunUrl")
    @Expose
    private String RunUrl;

    /**
    * runReqParams
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunReqParams")
    @Expose
    private String RunReqParams;

    /**
    * stopUrl
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StopUrl")
    @Expose
    private String StopUrl;

    /**
    * stopReqParams
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StopReqParams")
    @Expose
    private String StopReqParams;

    /**
    * stateMonitorUrl
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StateMonitorUrl")
    @Expose
    private String StateMonitorUrl;

    /**
    * runLogUrl
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunLogUrl")
    @Expose
    private String RunLogUrl;

    /**
    * logDownloadUrl
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogDownloadUrl")
    @Expose
    private String LogDownloadUrl;

    /**
    * markUrl
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MarkUrl")
    @Expose
    private String MarkUrl;

    /**
    * source_cluster
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceCluster")
    @Expose
    private String SourceCluster;

    /**
    * source_service
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceService")
    @Expose
    private String SourceService;

    /**
    * source_server
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceServer")
    @Expose
    private String SourceServer;

    /**
    * sql_file_name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlFileName")
    @Expose
    private String SqlFileName;

    /**
    * dbType
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * engine
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * typeId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * fileName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * bucket
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * region
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * extraInfo
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * userFileId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserFileId")
    @Expose
    private String UserFileId;

    /**
     * Get taskId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId taskId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set taskId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId taskId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get taskName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName taskName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set taskName
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName taskName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get taskType
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType taskType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set taskType
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType taskType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Type
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type Type
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type Type
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get runUrl
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunUrl runUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunUrl() {
        return this.RunUrl;
    }

    /**
     * Set runUrl
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunUrl runUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunUrl(String RunUrl) {
        this.RunUrl = RunUrl;
    }

    /**
     * Get runReqParams
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunReqParams runReqParams
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunReqParams() {
        return this.RunReqParams;
    }

    /**
     * Set runReqParams
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunReqParams runReqParams
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunReqParams(String RunReqParams) {
        this.RunReqParams = RunReqParams;
    }

    /**
     * Get stopUrl
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StopUrl stopUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStopUrl() {
        return this.StopUrl;
    }

    /**
     * Set stopUrl
注意：此字段可能返回 null，表示取不到有效值。
     * @param StopUrl stopUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStopUrl(String StopUrl) {
        this.StopUrl = StopUrl;
    }

    /**
     * Get stopReqParams
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StopReqParams stopReqParams
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStopReqParams() {
        return this.StopReqParams;
    }

    /**
     * Set stopReqParams
注意：此字段可能返回 null，表示取不到有效值。
     * @param StopReqParams stopReqParams
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStopReqParams(String StopReqParams) {
        this.StopReqParams = StopReqParams;
    }

    /**
     * Get stateMonitorUrl
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StateMonitorUrl stateMonitorUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStateMonitorUrl() {
        return this.StateMonitorUrl;
    }

    /**
     * Set stateMonitorUrl
注意：此字段可能返回 null，表示取不到有效值。
     * @param StateMonitorUrl stateMonitorUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStateMonitorUrl(String StateMonitorUrl) {
        this.StateMonitorUrl = StateMonitorUrl;
    }

    /**
     * Get runLogUrl
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunLogUrl runLogUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunLogUrl() {
        return this.RunLogUrl;
    }

    /**
     * Set runLogUrl
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunLogUrl runLogUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunLogUrl(String RunLogUrl) {
        this.RunLogUrl = RunLogUrl;
    }

    /**
     * Get logDownloadUrl
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogDownloadUrl logDownloadUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogDownloadUrl() {
        return this.LogDownloadUrl;
    }

    /**
     * Set logDownloadUrl
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogDownloadUrl logDownloadUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogDownloadUrl(String LogDownloadUrl) {
        this.LogDownloadUrl = LogDownloadUrl;
    }

    /**
     * Get markUrl
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MarkUrl markUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMarkUrl() {
        return this.MarkUrl;
    }

    /**
     * Set markUrl
注意：此字段可能返回 null，表示取不到有效值。
     * @param MarkUrl markUrl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarkUrl(String MarkUrl) {
        this.MarkUrl = MarkUrl;
    }

    /**
     * Get source_cluster
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceCluster source_cluster
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceCluster() {
        return this.SourceCluster;
    }

    /**
     * Set source_cluster
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceCluster source_cluster
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceCluster(String SourceCluster) {
        this.SourceCluster = SourceCluster;
    }

    /**
     * Get source_service
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceService source_service
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceService() {
        return this.SourceService;
    }

    /**
     * Set source_service
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceService source_service
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceService(String SourceService) {
        this.SourceService = SourceService;
    }

    /**
     * Get source_server
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceServer source_server
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceServer() {
        return this.SourceServer;
    }

    /**
     * Set source_server
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceServer source_server
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceServer(String SourceServer) {
        this.SourceServer = SourceServer;
    }

    /**
     * Get sql_file_name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlFileName sql_file_name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlFileName() {
        return this.SqlFileName;
    }

    /**
     * Set sql_file_name
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlFileName sql_file_name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlFileName(String SqlFileName) {
        this.SqlFileName = SqlFileName;
    }

    /**
     * Get dbType
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbType dbType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set dbType
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbType dbType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get engine
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Engine engine
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set engine
注意：此字段可能返回 null，表示取不到有效值。
     * @param Engine engine
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get typeId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeId typeId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set typeId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeId typeId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get fileName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName fileName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set fileName
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName fileName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get bucket
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bucket bucket
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set bucket
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bucket bucket
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get region
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set region
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get extraInfo
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo extraInfo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set extraInfo
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo extraInfo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get userFileId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserFileId userFileId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserFileId() {
        return this.UserFileId;
    }

    /**
     * Set userFileId
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserFileId userFileId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserFileId(String UserFileId) {
        this.UserFileId = UserFileId;
    }

    public CustomizeBusinessEntityDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomizeBusinessEntityDTO(CustomizeBusinessEntityDTO source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RunUrl != null) {
            this.RunUrl = new String(source.RunUrl);
        }
        if (source.RunReqParams != null) {
            this.RunReqParams = new String(source.RunReqParams);
        }
        if (source.StopUrl != null) {
            this.StopUrl = new String(source.StopUrl);
        }
        if (source.StopReqParams != null) {
            this.StopReqParams = new String(source.StopReqParams);
        }
        if (source.StateMonitorUrl != null) {
            this.StateMonitorUrl = new String(source.StateMonitorUrl);
        }
        if (source.RunLogUrl != null) {
            this.RunLogUrl = new String(source.RunLogUrl);
        }
        if (source.LogDownloadUrl != null) {
            this.LogDownloadUrl = new String(source.LogDownloadUrl);
        }
        if (source.MarkUrl != null) {
            this.MarkUrl = new String(source.MarkUrl);
        }
        if (source.SourceCluster != null) {
            this.SourceCluster = new String(source.SourceCluster);
        }
        if (source.SourceService != null) {
            this.SourceService = new String(source.SourceService);
        }
        if (source.SourceServer != null) {
            this.SourceServer = new String(source.SourceServer);
        }
        if (source.SqlFileName != null) {
            this.SqlFileName = new String(source.SqlFileName);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.UserFileId != null) {
            this.UserFileId = new String(source.UserFileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RunUrl", this.RunUrl);
        this.setParamSimple(map, prefix + "RunReqParams", this.RunReqParams);
        this.setParamSimple(map, prefix + "StopUrl", this.StopUrl);
        this.setParamSimple(map, prefix + "StopReqParams", this.StopReqParams);
        this.setParamSimple(map, prefix + "StateMonitorUrl", this.StateMonitorUrl);
        this.setParamSimple(map, prefix + "RunLogUrl", this.RunLogUrl);
        this.setParamSimple(map, prefix + "LogDownloadUrl", this.LogDownloadUrl);
        this.setParamSimple(map, prefix + "MarkUrl", this.MarkUrl);
        this.setParamSimple(map, prefix + "SourceCluster", this.SourceCluster);
        this.setParamSimple(map, prefix + "SourceService", this.SourceService);
        this.setParamSimple(map, prefix + "SourceServer", this.SourceServer);
        this.setParamSimple(map, prefix + "SqlFileName", this.SqlFileName);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "UserFileId", this.UserFileId);

    }
}

