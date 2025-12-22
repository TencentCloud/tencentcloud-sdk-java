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
package com.tencentcloudapi.thpc.v20220401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagerNode extends AbstractModel {

    /**
    * <p>节点<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。</p>枚举值：<ul><li> PREPAID： 预付费，即包年包月</li><li> POSTPAID_BY_HOUR： 按小时后付费</li></ul>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>节点机型。不同实例机型指定了不同的资源规格。 <br><li>具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述。</li>   </p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>节点显示名称。<br><li> 不指定节点显示名称则默认显示‘未命名’。 </li><li>购买多个节点，如果指定模式串<code>{R:x}</code>，表示生成数字[<code>[x, x+n-1]</code>，其中<code>n</code>表示购买节点的数量，例如<code>server_{R:3}</code>，购买1个时，节点显示名称为<code>server_3</code>；购买2个时，节点显示名称分别为<code>server_3</code>，<code>server_4</code>。支持指定多个模式串<code>{R:x}</code>。 购买多个节点，如果不指定模式串，则在节点显示名称添加后缀<code>1、2...n</code>，其中<code>n</code>表示购买节点的数量，例如<code>server_</code>，购买2个时，节点显示名称分别为<code>server_1</code>，<code>server_2</code>。</li><li> 最多支持60个字符（包含模式串）。</li></p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
     * Get <p>节点<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。</p>枚举值：<ul><li> PREPAID： 预付费，即包年包月</li><li> POSTPAID_BY_HOUR： 按小时后付费</li></ul> 
     * @return InstanceChargeType <p>节点<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。</p>枚举值：<ul><li> PREPAID： 预付费，即包年包月</li><li> POSTPAID_BY_HOUR： 按小时后付费</li></ul>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>节点<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。</p>枚举值：<ul><li> PREPAID： 预付费，即包年包月</li><li> POSTPAID_BY_HOUR： 按小时后付费</li></ul>
     * @param InstanceChargeType <p>节点<a href="https://cloud.tencent.com/document/product/213/2180">计费类型</a>。</p>枚举值：<ul><li> PREPAID： 预付费，即包年包月</li><li> POSTPAID_BY_HOUR： 按小时后付费</li></ul>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。</p> 
     * @return InstanceChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。</p>
     * @param InstanceChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>节点机型。不同实例机型指定了不同的资源规格。 <br><li>具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述。</li>   </p> 
     * @return InstanceType <p>节点机型。不同实例机型指定了不同的资源规格。 <br><li>具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述。</li>   </p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>节点机型。不同实例机型指定了不同的资源规格。 <br><li>具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述。</li>   </p>
     * @param InstanceType <p>节点机型。不同实例机型指定了不同的资源规格。 <br><li>具体取值可通过调用接口<a href="https://cloud.tencent.com/document/api/213/15749">DescribeInstanceTypeConfigs</a>来获得最新的规格表或参见<a href="https://cloud.tencent.com/document/product/213/11518">实例规格</a>描述。</li>   </p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p> 
     * @return SystemDisk <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     * @param SystemDisk <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p> 
     * @return DataDisks <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
     * @param DataDisks <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p> 
     * @return InternetAccessible <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
     * @param InternetAccessible <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>节点显示名称。<br><li> 不指定节点显示名称则默认显示‘未命名’。 </li><li>购买多个节点，如果指定模式串<code>{R:x}</code>，表示生成数字[<code>[x, x+n-1]</code>，其中<code>n</code>表示购买节点的数量，例如<code>server_{R:3}</code>，购买1个时，节点显示名称为<code>server_3</code>；购买2个时，节点显示名称分别为<code>server_3</code>，<code>server_4</code>。支持指定多个模式串<code>{R:x}</code>。 购买多个节点，如果不指定模式串，则在节点显示名称添加后缀<code>1、2...n</code>，其中<code>n</code>表示购买节点的数量，例如<code>server_</code>，购买2个时，节点显示名称分别为<code>server_1</code>，<code>server_2</code>。</li><li> 最多支持60个字符（包含模式串）。</li></p> 
     * @return InstanceName <p>节点显示名称。<br><li> 不指定节点显示名称则默认显示‘未命名’。 </li><li>购买多个节点，如果指定模式串<code>{R:x}</code>，表示生成数字[<code>[x, x+n-1]</code>，其中<code>n</code>表示购买节点的数量，例如<code>server_{R:3}</code>，购买1个时，节点显示名称为<code>server_3</code>；购买2个时，节点显示名称分别为<code>server_3</code>，<code>server_4</code>。支持指定多个模式串<code>{R:x}</code>。 购买多个节点，如果不指定模式串，则在节点显示名称添加后缀<code>1、2...n</code>，其中<code>n</code>表示购买节点的数量，例如<code>server_</code>，购买2个时，节点显示名称分别为<code>server_1</code>，<code>server_2</code>。</li><li> 最多支持60个字符（包含模式串）。</li></p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>节点显示名称。<br><li> 不指定节点显示名称则默认显示‘未命名’。 </li><li>购买多个节点，如果指定模式串<code>{R:x}</code>，表示生成数字[<code>[x, x+n-1]</code>，其中<code>n</code>表示购买节点的数量，例如<code>server_{R:3}</code>，购买1个时，节点显示名称为<code>server_3</code>；购买2个时，节点显示名称分别为<code>server_3</code>，<code>server_4</code>。支持指定多个模式串<code>{R:x}</code>。 购买多个节点，如果不指定模式串，则在节点显示名称添加后缀<code>1、2...n</code>，其中<code>n</code>表示购买节点的数量，例如<code>server_</code>，购买2个时，节点显示名称分别为<code>server_1</code>，<code>server_2</code>。</li><li> 最多支持60个字符（包含模式串）。</li></p>
     * @param InstanceName <p>节点显示名称。<br><li> 不指定节点显示名称则默认显示‘未命名’。 </li><li>购买多个节点，如果指定模式串<code>{R:x}</code>，表示生成数字[<code>[x, x+n-1]</code>，其中<code>n</code>表示购买节点的数量，例如<code>server_{R:3}</code>，购买1个时，节点显示名称为<code>server_3</code>；购买2个时，节点显示名称分别为<code>server_3</code>，<code>server_4</code>。支持指定多个模式串<code>{R:x}</code>。 购买多个节点，如果不指定模式串，则在节点显示名称添加后缀<code>1、2...n</code>，其中<code>n</code>表示购买节点的数量，例如<code>server_</code>，购买2个时，节点显示名称分别为<code>server_1</code>，<code>server_2</code>。</li><li> 最多支持60个字符（包含模式串）。</li></p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public ManagerNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagerNode(ManagerNode source) {
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);

    }
}

