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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServerlessSpaceV2Request extends AbstractModel {

    /**
    * vpc信息
    */
    @SerializedName("VpcInfo")
    @Expose
    private VpcInfo [] VpcInfo;

    /**
    * 索引空间名
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
    * 空间名称
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 白名单列表
    */
    @SerializedName("KibanaWhiteIpList")
    @Expose
    private String [] KibanaWhiteIpList;

    /**
    * 空间id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 标签信息
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
     * Get vpc信息 
     * @return VpcInfo vpc信息
     */
    public VpcInfo [] getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set vpc信息
     * @param VpcInfo vpc信息
     */
    public void setVpcInfo(VpcInfo [] VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get 索引空间名 
     * @return SpaceName 索引空间名
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set 索引空间名
     * @param SpaceName 索引空间名
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    /**
     * Get 空间名称 
     * @return Zone 空间名称
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 空间名称
     * @param Zone 空间名称
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 白名单列表 
     * @return KibanaWhiteIpList 白名单列表
     */
    public String [] getKibanaWhiteIpList() {
        return this.KibanaWhiteIpList;
    }

    /**
     * Set 白名单列表
     * @param KibanaWhiteIpList 白名单列表
     */
    public void setKibanaWhiteIpList(String [] KibanaWhiteIpList) {
        this.KibanaWhiteIpList = KibanaWhiteIpList;
    }

    /**
     * Get 空间id 
     * @return ZoneId 空间id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 空间id
     * @param ZoneId 空间id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 标签信息 
     * @return TagList 标签信息
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签信息
     * @param TagList 标签信息
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    public CreateServerlessSpaceV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServerlessSpaceV2Request(CreateServerlessSpaceV2Request source) {
        if (source.VpcInfo != null) {
            this.VpcInfo = new VpcInfo[source.VpcInfo.length];
            for (int i = 0; i < source.VpcInfo.length; i++) {
                this.VpcInfo[i] = new VpcInfo(source.VpcInfo[i]);
            }
        }
        if (source.SpaceName != null) {
            this.SpaceName = new String(source.SpaceName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.KibanaWhiteIpList != null) {
            this.KibanaWhiteIpList = new String[source.KibanaWhiteIpList.length];
            for (int i = 0; i < source.KibanaWhiteIpList.length; i++) {
                this.KibanaWhiteIpList[i] = new String(source.KibanaWhiteIpList[i]);
            }
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VpcInfo.", this.VpcInfo);
        this.setParamSimple(map, prefix + "SpaceName", this.SpaceName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "KibanaWhiteIpList.", this.KibanaWhiteIpList);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

