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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAlertStatusListRequest extends AbstractModel {

    /**
    * 告警ID列表
    */
    @SerializedName("ID")
    @Expose
    private NewAlertKey [] ID;

    /**
    * 操作类型 
1:撤销处置 
2:标记为已处置 
3:标记忽略 
4:取消标记处置
5:取消标记忽略
    */
    @SerializedName("OperateType")
    @Expose
    private Long OperateType;

    /**
    * 被调用的集团账号的成员id
    */
    @SerializedName("OperatedMemberId")
    @Expose
    private String [] OperatedMemberId;

    /**
     * Get 告警ID列表 
     * @return ID 告警ID列表
     */
    public NewAlertKey [] getID() {
        return this.ID;
    }

    /**
     * Set 告警ID列表
     * @param ID 告警ID列表
     */
    public void setID(NewAlertKey [] ID) {
        this.ID = ID;
    }

    /**
     * Get 操作类型 
1:撤销处置 
2:标记为已处置 
3:标记忽略 
4:取消标记处置
5:取消标记忽略 
     * @return OperateType 操作类型 
1:撤销处置 
2:标记为已处置 
3:标记忽略 
4:取消标记处置
5:取消标记忽略
     */
    public Long getOperateType() {
        return this.OperateType;
    }

    /**
     * Set 操作类型 
1:撤销处置 
2:标记为已处置 
3:标记忽略 
4:取消标记处置
5:取消标记忽略
     * @param OperateType 操作类型 
1:撤销处置 
2:标记为已处置 
3:标记忽略 
4:取消标记处置
5:取消标记忽略
     */
    public void setOperateType(Long OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Get 被调用的集团账号的成员id 
     * @return OperatedMemberId 被调用的集团账号的成员id
     */
    public String [] getOperatedMemberId() {
        return this.OperatedMemberId;
    }

    /**
     * Set 被调用的集团账号的成员id
     * @param OperatedMemberId 被调用的集团账号的成员id
     */
    public void setOperatedMemberId(String [] OperatedMemberId) {
        this.OperatedMemberId = OperatedMemberId;
    }

    public UpdateAlertStatusListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAlertStatusListRequest(UpdateAlertStatusListRequest source) {
        if (source.ID != null) {
            this.ID = new NewAlertKey[source.ID.length];
            for (int i = 0; i < source.ID.length; i++) {
                this.ID[i] = new NewAlertKey(source.ID[i]);
            }
        }
        if (source.OperateType != null) {
            this.OperateType = new Long(source.OperateType);
        }
        if (source.OperatedMemberId != null) {
            this.OperatedMemberId = new String[source.OperatedMemberId.length];
            for (int i = 0; i < source.OperatedMemberId.length; i++) {
                this.OperatedMemberId[i] = new String(source.OperatedMemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ID.", this.ID);
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);
        this.setParamArraySimple(map, prefix + "OperatedMemberId.", this.OperatedMemberId);

    }
}

