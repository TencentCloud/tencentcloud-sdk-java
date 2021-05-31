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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainListRequest extends AbstractModel{

    /**
    * 域名分组类型，默认为ALL。可取值为ALL，MINE，SHARE，ISMARK，PAUSE，VIP，RECENT，SHARE_OUT。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 记录开始的偏移, 第一条记录为 0, 依次类推。默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 要获取的域名数量, 比如获取20个, 则为20。默认值为3000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分组ID, 获取指定分组的域名
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 根据关键字搜索域名
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 域名分组类型，默认为ALL。可取值为ALL，MINE，SHARE，ISMARK，PAUSE，VIP，RECENT，SHARE_OUT。 
     * @return Type 域名分组类型，默认为ALL。可取值为ALL，MINE，SHARE，ISMARK，PAUSE，VIP，RECENT，SHARE_OUT。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 域名分组类型，默认为ALL。可取值为ALL，MINE，SHARE，ISMARK，PAUSE，VIP，RECENT，SHARE_OUT。
     * @param Type 域名分组类型，默认为ALL。可取值为ALL，MINE，SHARE，ISMARK，PAUSE，VIP，RECENT，SHARE_OUT。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 记录开始的偏移, 第一条记录为 0, 依次类推。默认值为0。 
     * @return Offset 记录开始的偏移, 第一条记录为 0, 依次类推。默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录开始的偏移, 第一条记录为 0, 依次类推。默认值为0。
     * @param Offset 记录开始的偏移, 第一条记录为 0, 依次类推。默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 要获取的域名数量, 比如获取20个, 则为20。默认值为3000。 
     * @return Limit 要获取的域名数量, 比如获取20个, 则为20。默认值为3000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 要获取的域名数量, 比如获取20个, 则为20。默认值为3000。
     * @param Limit 要获取的域名数量, 比如获取20个, 则为20。默认值为3000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分组ID, 获取指定分组的域名 
     * @return GroupId 分组ID, 获取指定分组的域名
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID, 获取指定分组的域名
     * @param GroupId 分组ID, 获取指定分组的域名
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 根据关键字搜索域名 
     * @return Keyword 根据关键字搜索域名
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 根据关键字搜索域名
     * @param Keyword 根据关键字搜索域名
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeDomainListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainListRequest(DescribeDomainListRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

