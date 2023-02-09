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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDocumentsByRoomRequest extends AbstractModel{

    /**
    * 房间ID。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 低代码互动课堂的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 分页查询当前页数，从1开始递增，默认值为1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页数据量，最大1000，默认值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 课件权限。
[0]：获取owner的私有课件；
[1]：获取owner的公开课件;
[0,1]：则获取owner的私有课件和公开课件；
[2]：获取owner的私有课件和所有人(包括owner)的公开课件。
默认值为[2]
    */
    @SerializedName("Permission")
    @Expose
    private Long [] Permission;

    /**
    * 文档所有者的user_id，不填默认获取SdkAppId下所有课件
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
     * Get 房间ID。 
     * @return RoomId 房间ID。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间ID。
     * @param RoomId 房间ID。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 低代码互动课堂的SdkAppId 
     * @return SdkAppId 低代码互动课堂的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 低代码互动课堂的SdkAppId
     * @param SdkAppId 低代码互动课堂的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 分页查询当前页数，从1开始递增，默认值为1 
     * @return Page 分页查询当前页数，从1开始递增，默认值为1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页查询当前页数，从1开始递增，默认值为1
     * @param Page 分页查询当前页数，从1开始递增，默认值为1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页数据量，最大1000，默认值为100 
     * @return Limit 每页数据量，最大1000，默认值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数据量，最大1000，默认值为100
     * @param Limit 每页数据量，最大1000，默认值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 课件权限。
[0]：获取owner的私有课件；
[1]：获取owner的公开课件;
[0,1]：则获取owner的私有课件和公开课件；
[2]：获取owner的私有课件和所有人(包括owner)的公开课件。
默认值为[2] 
     * @return Permission 课件权限。
[0]：获取owner的私有课件；
[1]：获取owner的公开课件;
[0,1]：则获取owner的私有课件和公开课件；
[2]：获取owner的私有课件和所有人(包括owner)的公开课件。
默认值为[2]
     */
    public Long [] getPermission() {
        return this.Permission;
    }

    /**
     * Set 课件权限。
[0]：获取owner的私有课件；
[1]：获取owner的公开课件;
[0,1]：则获取owner的私有课件和公开课件；
[2]：获取owner的私有课件和所有人(包括owner)的公开课件。
默认值为[2]
     * @param Permission 课件权限。
[0]：获取owner的私有课件；
[1]：获取owner的公开课件;
[0,1]：则获取owner的私有课件和公开课件；
[2]：获取owner的私有课件和所有人(包括owner)的公开课件。
默认值为[2]
     */
    public void setPermission(Long [] Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 文档所有者的user_id，不填默认获取SdkAppId下所有课件 
     * @return Owner 文档所有者的user_id，不填默认获取SdkAppId下所有课件
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 文档所有者的user_id，不填默认获取SdkAppId下所有课件
     * @param Owner 文档所有者的user_id，不填默认获取SdkAppId下所有课件
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public DescribeDocumentsByRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDocumentsByRoomRequest(DescribeDocumentsByRoomRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Permission != null) {
            this.Permission = new Long[source.Permission.length];
            for (int i = 0; i < source.Permission.length; i++) {
                this.Permission[i] = new Long(source.Permission[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Permission.", this.Permission);
        this.setParamSimple(map, prefix + "Owner", this.Owner);

    }
}

