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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddAlarmProcessRecordRequest extends AbstractModel {

    /**
    * 处理记录项
    */
    @SerializedName("RecordSet")
    @Expose
    private ProcessRecordInfo [] RecordSet;

    /**
    * 工作空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 非孪生平台外部应用appid
    */
    @SerializedName("ApplicationId")
    @Expose
    private Long ApplicationId;

    /**
    * 此字段填写的是非孪生中台的用户id（多个用逗号分隔），如果是非孪生中台用户必填该字段

    */
    @SerializedName("ExtendOne")
    @Expose
    private String ExtendOne;

    /**
     * Get 处理记录项 
     * @return RecordSet 处理记录项
     */
    public ProcessRecordInfo [] getRecordSet() {
        return this.RecordSet;
    }

    /**
     * Set 处理记录项
     * @param RecordSet 处理记录项
     */
    public void setRecordSet(ProcessRecordInfo [] RecordSet) {
        this.RecordSet = RecordSet;
    }

    /**
     * Get 工作空间id 
     * @return WorkspaceId 工作空间id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间id
     * @param WorkspaceId 工作空间id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 非孪生平台外部应用appid 
     * @return ApplicationId 非孪生平台外部应用appid
     */
    public Long getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 非孪生平台外部应用appid
     * @param ApplicationId 非孪生平台外部应用appid
     */
    public void setApplicationId(Long ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 此字段填写的是非孪生中台的用户id（多个用逗号分隔），如果是非孪生中台用户必填该字段
 
     * @return ExtendOne 此字段填写的是非孪生中台的用户id（多个用逗号分隔），如果是非孪生中台用户必填该字段

     */
    public String getExtendOne() {
        return this.ExtendOne;
    }

    /**
     * Set 此字段填写的是非孪生中台的用户id（多个用逗号分隔），如果是非孪生中台用户必填该字段

     * @param ExtendOne 此字段填写的是非孪生中台的用户id（多个用逗号分隔），如果是非孪生中台用户必填该字段

     */
    public void setExtendOne(String ExtendOne) {
        this.ExtendOne = ExtendOne;
    }

    public AddAlarmProcessRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddAlarmProcessRecordRequest(AddAlarmProcessRecordRequest source) {
        if (source.RecordSet != null) {
            this.RecordSet = new ProcessRecordInfo[source.RecordSet.length];
            for (int i = 0; i < source.RecordSet.length; i++) {
                this.RecordSet[i] = new ProcessRecordInfo(source.RecordSet[i]);
            }
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new Long(source.ApplicationId);
        }
        if (source.ExtendOne != null) {
            this.ExtendOne = new String(source.ExtendOne);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RecordSet.", this.RecordSet);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ExtendOne", this.ExtendOne);

    }
}

