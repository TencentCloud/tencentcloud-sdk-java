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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProxyGroupRequest extends AbstractModel {

    /**
    * <p>通道组所属项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>通道组别名</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>源站地域，参考接口 [https://cloud.tencent.com/document/api/608/36964] 返回参数RegionDetail中的RegionId</p>
    */
    @SerializedName("RealServerRegion")
    @Expose
    private String RealServerRegion;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * <p>加速地域列表，包括加速地域名，及该地域对应的带宽和并发配置。</p>
    */
    @SerializedName("AccessRegionSet")
    @Expose
    private AccessConfiguration [] AccessRegionSet;

    /**
    * <p>IP版本，可取值：IPv4、IPv6，默认值IPv4</p>
    */
    @SerializedName("IPAddressVersion")
    @Expose
    private String IPAddressVersion;

    /**
    * <p>通道组套餐类型，可取值：Thunder、Accelerator，默认值Thunder</p>
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * <p>该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道组默认支持Http3.0；当为IPv6，默认不支持Http3.0。</p>
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get <p>通道组所属项目ID</p> 
     * @return ProjectId <p>通道组所属项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>通道组所属项目ID</p>
     * @param ProjectId <p>通道组所属项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>通道组别名</p> 
     * @return GroupName <p>通道组别名</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>通道组别名</p>
     * @param GroupName <p>通道组别名</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>源站地域，参考接口 [https://cloud.tencent.com/document/api/608/36964] 返回参数RegionDetail中的RegionId</p> 
     * @return RealServerRegion <p>源站地域，参考接口 [https://cloud.tencent.com/document/api/608/36964] 返回参数RegionDetail中的RegionId</p>
     */
    public String getRealServerRegion() {
        return this.RealServerRegion;
    }

    /**
     * Set <p>源站地域，参考接口 [https://cloud.tencent.com/document/api/608/36964] 返回参数RegionDetail中的RegionId</p>
     * @param RealServerRegion <p>源站地域，参考接口 [https://cloud.tencent.com/document/api/608/36964] 返回参数RegionDetail中的RegionId</p>
     */
    public void setRealServerRegion(String RealServerRegion) {
        this.RealServerRegion = RealServerRegion;
    }

    /**
     * Get <p>标签列表</p> 
     * @return TagSet <p>标签列表</p>
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签列表</p>
     * @param TagSet <p>标签列表</p>
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>加速地域列表，包括加速地域名，及该地域对应的带宽和并发配置。</p> 
     * @return AccessRegionSet <p>加速地域列表，包括加速地域名，及该地域对应的带宽和并发配置。</p>
     */
    public AccessConfiguration [] getAccessRegionSet() {
        return this.AccessRegionSet;
    }

    /**
     * Set <p>加速地域列表，包括加速地域名，及该地域对应的带宽和并发配置。</p>
     * @param AccessRegionSet <p>加速地域列表，包括加速地域名，及该地域对应的带宽和并发配置。</p>
     */
    public void setAccessRegionSet(AccessConfiguration [] AccessRegionSet) {
        this.AccessRegionSet = AccessRegionSet;
    }

    /**
     * Get <p>IP版本，可取值：IPv4、IPv6，默认值IPv4</p> 
     * @return IPAddressVersion <p>IP版本，可取值：IPv4、IPv6，默认值IPv4</p>
     */
    public String getIPAddressVersion() {
        return this.IPAddressVersion;
    }

    /**
     * Set <p>IP版本，可取值：IPv4、IPv6，默认值IPv4</p>
     * @param IPAddressVersion <p>IP版本，可取值：IPv4、IPv6，默认值IPv4</p>
     */
    public void setIPAddressVersion(String IPAddressVersion) {
        this.IPAddressVersion = IPAddressVersion;
    }

    /**
     * Get <p>通道组套餐类型，可取值：Thunder、Accelerator，默认值Thunder</p> 
     * @return PackageType <p>通道组套餐类型，可取值：Thunder、Accelerator，默认值Thunder</p>
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>通道组套餐类型，可取值：Thunder、Accelerator，默认值Thunder</p>
     * @param PackageType <p>通道组套餐类型，可取值：Thunder、Accelerator，默认值Thunder</p>
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get <p>该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道组默认支持Http3.0；当为IPv6，默认不支持Http3.0。</p> 
     * @return Http3Supported <p>该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道组默认支持Http3.0；当为IPv6，默认不支持Http3.0。</p>
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set <p>该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道组默认支持Http3.0；当为IPv6，默认不支持Http3.0。</p>
     * @param Http3Supported <p>该字段已废弃，当IPAddressVersion为IPv4时，所创建的通道组默认支持Http3.0；当为IPv6，默认不支持Http3.0。</p>
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

