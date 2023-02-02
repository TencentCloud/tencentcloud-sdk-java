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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRoomMemberRequest extends AbstractModel{

    /**
    * 要操作的房间id
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 剔除类型 1-删除房间 2-剔除用户
    */
    @SerializedName("DeleteType")
    @Expose
    private Long DeleteType;

    /**
    * 应用id
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 要剔除的用户列表
    */
    @SerializedName("Uids")
    @Expose
    private String [] Uids;

    /**
     * Get 要操作的房间id 
     * @return RoomId 要操作的房间id
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 要操作的房间id
     * @param RoomId 要操作的房间id
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 剔除类型 1-删除房间 2-剔除用户 
     * @return DeleteType 剔除类型 1-删除房间 2-剔除用户
     */
    public Long getDeleteType() {
        return this.DeleteType;
    }

    /**
     * Set 剔除类型 1-删除房间 2-剔除用户
     * @param DeleteType 剔除类型 1-删除房间 2-剔除用户
     */
    public void setDeleteType(Long DeleteType) {
        this.DeleteType = DeleteType;
    }

    /**
     * Get 应用id 
     * @return BizId 应用id
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用id
     * @param BizId 应用id
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 要剔除的用户列表 
     * @return Uids 要剔除的用户列表
     */
    public String [] getUids() {
        return this.Uids;
    }

    /**
     * Set 要剔除的用户列表
     * @param Uids 要剔除的用户列表
     */
    public void setUids(String [] Uids) {
        this.Uids = Uids;
    }

    public DeleteRoomMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRoomMemberRequest(DeleteRoomMemberRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.DeleteType != null) {
            this.DeleteType = new Long(source.DeleteType);
        }
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.Uids != null) {
            this.Uids = new String[source.Uids.length];
            for (int i = 0; i < source.Uids.length; i++) {
                this.Uids[i] = new String(source.Uids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "DeleteType", this.DeleteType);
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamArraySimple(map, prefix + "Uids.", this.Uids);

    }
}

