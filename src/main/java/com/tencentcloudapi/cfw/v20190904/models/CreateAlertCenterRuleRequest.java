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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlertCenterRuleRequest extends AbstractModel {

    /**
    * 处置时间
1  1天
7   7天
-2 永久
    */
    @SerializedName("HandleTime")
    @Expose
    private Long HandleTime;

    /**
    * 处置类型
当HandleIdList 不为空时：1封禁 2放通  
当HandleIpList 不为空时：3放通 4封禁
    */
    @SerializedName("HandleType")
    @Expose
    private Long HandleType;

    /**
    * 当前日志方向： 0 出向 1 入向
    */
    @SerializedName("AlertDirection")
    @Expose
    private Long AlertDirection;

    /**
    * 处置方向： 0出向 1入向 0,1出入向 3内网
    */
    @SerializedName("HandleDirection")
    @Expose
    private String HandleDirection;

    /**
    * 处置对象,ID列表，  IdLists和IpList二选一
    */
    @SerializedName("HandleIdList")
    @Expose
    private String [] HandleIdList;

    /**
    * 处置对象,IP列表，  IdLists和IpList二选一
    */
    @SerializedName("HandleIpList")
    @Expose
    private String [] HandleIpList;

    /**
    * 处置描述
    */
    @SerializedName("HandleComment")
    @Expose
    private String HandleComment;

    /**
    * 放通原因:
0默认 1重复 2误报 3紧急放通
    */
    @SerializedName("IgnoreReason")
    @Expose
    private Long IgnoreReason;

    /**
    * 封禁域名-保留字段
    */
    @SerializedName("BlockDomain")
    @Expose
    private String BlockDomain;

    /**
     * Get 处置时间
1  1天
7   7天
-2 永久 
     * @return HandleTime 处置时间
1  1天
7   7天
-2 永久
     */
    public Long getHandleTime() {
        return this.HandleTime;
    }

    /**
     * Set 处置时间
1  1天
7   7天
-2 永久
     * @param HandleTime 处置时间
1  1天
7   7天
-2 永久
     */
    public void setHandleTime(Long HandleTime) {
        this.HandleTime = HandleTime;
    }

    /**
     * Get 处置类型
当HandleIdList 不为空时：1封禁 2放通  
当HandleIpList 不为空时：3放通 4封禁 
     * @return HandleType 处置类型
当HandleIdList 不为空时：1封禁 2放通  
当HandleIpList 不为空时：3放通 4封禁
     */
    public Long getHandleType() {
        return this.HandleType;
    }

    /**
     * Set 处置类型
当HandleIdList 不为空时：1封禁 2放通  
当HandleIpList 不为空时：3放通 4封禁
     * @param HandleType 处置类型
当HandleIdList 不为空时：1封禁 2放通  
当HandleIpList 不为空时：3放通 4封禁
     */
    public void setHandleType(Long HandleType) {
        this.HandleType = HandleType;
    }

    /**
     * Get 当前日志方向： 0 出向 1 入向 
     * @return AlertDirection 当前日志方向： 0 出向 1 入向
     */
    public Long getAlertDirection() {
        return this.AlertDirection;
    }

    /**
     * Set 当前日志方向： 0 出向 1 入向
     * @param AlertDirection 当前日志方向： 0 出向 1 入向
     */
    public void setAlertDirection(Long AlertDirection) {
        this.AlertDirection = AlertDirection;
    }

    /**
     * Get 处置方向： 0出向 1入向 0,1出入向 3内网 
     * @return HandleDirection 处置方向： 0出向 1入向 0,1出入向 3内网
     */
    public String getHandleDirection() {
        return this.HandleDirection;
    }

    /**
     * Set 处置方向： 0出向 1入向 0,1出入向 3内网
     * @param HandleDirection 处置方向： 0出向 1入向 0,1出入向 3内网
     */
    public void setHandleDirection(String HandleDirection) {
        this.HandleDirection = HandleDirection;
    }

    /**
     * Get 处置对象,ID列表，  IdLists和IpList二选一 
     * @return HandleIdList 处置对象,ID列表，  IdLists和IpList二选一
     */
    public String [] getHandleIdList() {
        return this.HandleIdList;
    }

    /**
     * Set 处置对象,ID列表，  IdLists和IpList二选一
     * @param HandleIdList 处置对象,ID列表，  IdLists和IpList二选一
     */
    public void setHandleIdList(String [] HandleIdList) {
        this.HandleIdList = HandleIdList;
    }

    /**
     * Get 处置对象,IP列表，  IdLists和IpList二选一 
     * @return HandleIpList 处置对象,IP列表，  IdLists和IpList二选一
     */
    public String [] getHandleIpList() {
        return this.HandleIpList;
    }

    /**
     * Set 处置对象,IP列表，  IdLists和IpList二选一
     * @param HandleIpList 处置对象,IP列表，  IdLists和IpList二选一
     */
    public void setHandleIpList(String [] HandleIpList) {
        this.HandleIpList = HandleIpList;
    }

    /**
     * Get 处置描述 
     * @return HandleComment 处置描述
     */
    public String getHandleComment() {
        return this.HandleComment;
    }

    /**
     * Set 处置描述
     * @param HandleComment 处置描述
     */
    public void setHandleComment(String HandleComment) {
        this.HandleComment = HandleComment;
    }

    /**
     * Get 放通原因:
0默认 1重复 2误报 3紧急放通 
     * @return IgnoreReason 放通原因:
0默认 1重复 2误报 3紧急放通
     */
    public Long getIgnoreReason() {
        return this.IgnoreReason;
    }

    /**
     * Set 放通原因:
0默认 1重复 2误报 3紧急放通
     * @param IgnoreReason 放通原因:
0默认 1重复 2误报 3紧急放通
     */
    public void setIgnoreReason(Long IgnoreReason) {
        this.IgnoreReason = IgnoreReason;
    }

    /**
     * Get 封禁域名-保留字段 
     * @return BlockDomain 封禁域名-保留字段
     */
    public String getBlockDomain() {
        return this.BlockDomain;
    }

    /**
     * Set 封禁域名-保留字段
     * @param BlockDomain 封禁域名-保留字段
     */
    public void setBlockDomain(String BlockDomain) {
        this.BlockDomain = BlockDomain;
    }

    public CreateAlertCenterRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlertCenterRuleRequest(CreateAlertCenterRuleRequest source) {
        if (source.HandleTime != null) {
            this.HandleTime = new Long(source.HandleTime);
        }
        if (source.HandleType != null) {
            this.HandleType = new Long(source.HandleType);
        }
        if (source.AlertDirection != null) {
            this.AlertDirection = new Long(source.AlertDirection);
        }
        if (source.HandleDirection != null) {
            this.HandleDirection = new String(source.HandleDirection);
        }
        if (source.HandleIdList != null) {
            this.HandleIdList = new String[source.HandleIdList.length];
            for (int i = 0; i < source.HandleIdList.length; i++) {
                this.HandleIdList[i] = new String(source.HandleIdList[i]);
            }
        }
        if (source.HandleIpList != null) {
            this.HandleIpList = new String[source.HandleIpList.length];
            for (int i = 0; i < source.HandleIpList.length; i++) {
                this.HandleIpList[i] = new String(source.HandleIpList[i]);
            }
        }
        if (source.HandleComment != null) {
            this.HandleComment = new String(source.HandleComment);
        }
        if (source.IgnoreReason != null) {
            this.IgnoreReason = new Long(source.IgnoreReason);
        }
        if (source.BlockDomain != null) {
            this.BlockDomain = new String(source.BlockDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HandleTime", this.HandleTime);
        this.setParamSimple(map, prefix + "HandleType", this.HandleType);
        this.setParamSimple(map, prefix + "AlertDirection", this.AlertDirection);
        this.setParamSimple(map, prefix + "HandleDirection", this.HandleDirection);
        this.setParamArraySimple(map, prefix + "HandleIdList.", this.HandleIdList);
        this.setParamArraySimple(map, prefix + "HandleIpList.", this.HandleIpList);
        this.setParamSimple(map, prefix + "HandleComment", this.HandleComment);
        this.setParamSimple(map, prefix + "IgnoreReason", this.IgnoreReason);
        this.setParamSimple(map, prefix + "BlockDomain", this.BlockDomain);

    }
}

