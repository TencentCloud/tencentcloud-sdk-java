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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProxyGroupRequest extends AbstractModel{

    /**
    * 通道组所属项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 通道组别名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 源站地域，参考接口DescribeDestRegions 返回参数RegionDetail中的RegionId
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * 标签列表
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * 加速地域列表，包括加速地域名，及该地域对应的带宽和并发配置。
    */
    @SerializedName("AccessRegionSet")
    @Expose
    private AccessConfiguration [] AccessRegionSet;

    /**
    * IP版本，可取值：IPv4、IPv6，默认值IPv4
    */
    @SerializedName("IPAddressVersion")
    @Expose
    private String IPAddressVersion;

    /**
    * 通道组套餐类型，可取值：Thunder、Accelerator，默认值Thunder
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 支持Http3的开关，其中：
0，表示不需要支持Http3接入；
1，表示需要支持Http3接入。
注意：如果开启了Http3的功能，那么该通道组就不再支持TCP/UDP接入的功能。
该功能的启停无法在通道组创建完毕后再修改。
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get 通道组所属项目ID 
     * @return ProjectId 通道组所属项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 通道组所属项目ID
     * @param ProjectId 通道组所属项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 通道组别名 
     * @return GroupName 通道组别名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 通道组别名
     * @param GroupName 通道组别名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 源站地域，参考接口DescribeDestRegions 返回参数RegionDetail中的RegionId 
     * @return RealServerRegion 源站地域，参考接口DescribeDestRegions 返回参数RegionDetail中的RegionId
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set 源站地域，参考接口DescribeDestRegions 返回参数RegionDetail中的RegionId
     * @param RealServerRegion 源站地域，参考接口DescribeDestRegions 返回参数RegionDetail中的RegionId
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get 标签列表 
     * @return TagSet 标签列表
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表
     * @param TagSet 标签列表
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 加速地域列表，包括加速地域名，及该地域对应的带宽和并发配置。 
     * @return AccessRegionSet 加速地域列表，包括加速地域名，及该地域对应的带宽和并发配置。
     */
    public AccessConfiguration [] getAccessRegionSet() {
        return this.AccessRegionSet;
    }

    /**
     * Set 加速地域列表，包括加速地域名，及该地域对应的带宽和并发配置。
     * @param AccessRegionSet 加速地域列表，包括加速地域名，及该地域对应的带宽和并发配置。
     */
    public void setAccessRegionSet(AccessConfiguration [] AccessRegionSet) {
        this.AccessRegionSet = AccessRegionSet;
    }

    /**
     * Get IP版本，可取值：IPv4、IPv6，默认值IPv4 
     * @return IPAddressVersion IP版本，可取值：IPv4、IPv6，默认值IPv4
     */
    public String getIPAddressVersion() {
        return this.IPAddressVersion;
    }

    /**
     * Set IP版本，可取值：IPv4、IPv6，默认值IPv4
     * @param IPAddressVersion IP版本，可取值：IPv4、IPv6，默认值IPv4
     */
    public void setIPAddressVersion(String IPAddressVersion) {
        this.IPAddressVersion = IPAddressVersion;
    }

    /**
     * Get 通道组套餐类型，可取值：Thunder、Accelerator，默认值Thunder 
     * @return PackageType 通道组套餐类型，可取值：Thunder、Accelerator，默认值Thunder
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 通道组套餐类型，可取值：Thunder、Accelerator，默认值Thunder
     * @param PackageType 通道组套餐类型，可取值：Thunder、Accelerator，默认值Thunder
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 支持Http3的开关，其中：
0，表示不需要支持Http3接入；
1，表示需要支持Http3接入。
注意：如果开启了Http3的功能，那么该通道组就不再支持TCP/UDP接入的功能。
该功能的启停无法在通道组创建完毕后再修改。 
     * @return Http3Supported 支持Http3的开关，其中：
0，表示不需要支持Http3接入；
1，表示需要支持Http3接入。
注意：如果开启了Http3的功能，那么该通道组就不再支持TCP/UDP接入的功能。
该功能的启停无法在通道组创建完毕后再修改。
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set 支持Http3的开关，其中：
0，表示不需要支持Http3接入；
1，表示需要支持Http3接入。
注意：如果开启了Http3的功能，那么该通道组就不再支持TCP/UDP接入的功能。
该功能的启停无法在通道组创建完毕后再修改。
     * @param Http3Supported 支持Http3的开关，其中：
0，表示不需要支持Http3接入；
1，表示需要支持Http3接入。
注意：如果开启了Http3的功能，那么该通道组就不再支持TCP/UDP接入的功能。
该功能的启停无法在通道组创建完毕后再修改。
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    public CreateProxyGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProxyGroupRequest(CreateProxyGroupRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.RealServerRegion != null) {
            this.RealServerRegion = new String(source.RealServerRegion);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
        if (source.AccessRegionSet != null) {
            this.AccessRegionSet = new AccessConfiguration[source.AccessRegionSet.length];
            for (int i = 0; i < source.AccessRegionSet.length; i++) {
                this.AccessRegionSet[i] = new AccessConfiguration(source.AccessRegionSet[i]);
            }
        }
        if (source.IPAddressVersion != null) {
            this.IPAddressVersion = new String(source.IPAddressVersion);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.Http3Supported != null) {
            this.Http3Supported = new Long(source.Http3Supported);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "RealServerRegion", this.RealServerRegion);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArrayObj(map, prefix + "AccessRegionSet.", this.AccessRegionSet);
        this.setParamSimple(map, prefix + "IPAddressVersion", this.IPAddressVersion);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);

    }
}

