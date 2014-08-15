/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.eureka.registry;

import com.netflix.eureka.datastore.Item;

import java.io.Serializable;
import java.util.HashSet;

/**
 * TODO: add ability to diff InstanceInfos
 * JavaBean for InstanceInfo.
 * @author David Liu
 */
public class InstanceInfo implements Item, Serializable {

    private static final long serialVersionUID = 331L;

    private String id;
    private String appGroup;
    private String app;
    private String asg;
    private String vipAddress;
    private String secureVipAddress;
    private String hostname;
    private String ip;
    private HashSet<Integer> ports;
    private HashSet<Integer> securePorts;
    private Status status;
    private String homePageUrl;
    private String statusPageUrl;
    private HashSet<String> healthCheckUrls;
    private InstanceLocation instanceLocation;

    // for serializers
    public InstanceInfo() {}

    /**
     * @return unique identifier of this instance
     */
    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the appgroup this instance belong to
     */
    public String getAppGroup() {
        return appGroup;
    }

    public void setAppGroup(String appGroup) {
        this.appGroup = appGroup;
    }

    /**
     * @return the application this instance belong to
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    /**
     * @return the asg this instance belong to
     */
    public String getAsg() {
        return asg;
    }

    public void setAsg(String asg) {
        this.asg = asg;
    }

    /**
     * @return the vip addresses of this instance
     */
    public String getVipAddress() {
        return vipAddress;
    }

    public void setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
    }

    /**
     * @return the secure vip address of this instance
     */
    public String getSecureVipAddress() {
        return secureVipAddress;
    }

    public void setSecureVipAddress(String secureVipAddress) {
        this.secureVipAddress = secureVipAddress;
    }

    /**
     * @return the hostname of this instance
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * @return ip address of this instance
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return the port numbers that is used for servicing requests
     */
    public HashSet<Integer> getPorts() {
        return ports;
    }

    public void setPorts(HashSet<Integer> ports) {
        this.ports = ports;
    }

    /**
     * @return the secure port numbers that is used for servicing requests
     */
    public HashSet<Integer> getSecurePorts() {
        return securePorts;
    }

    public void setSecurePorts(HashSet<Integer> securePorts) {
        this.securePorts = securePorts;
    }

    /**
     * @return the current status of this instance
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * @return home page {@link java.net.URL}
     */
    public String getHomePageUrl() {
        return homePageUrl;
    }

    public void setHomePageUrl(String homePageUrl) {
        this.homePageUrl = homePageUrl;
    }

    /**
     * @return status page {@link java.net.URL}
     */
    public String getStatusPageUrl() {
        return statusPageUrl;
    }

    public void setStatusPageUrl(String statusPageUrl) {
        this.statusPageUrl = statusPageUrl;
    }

    /**
     * Gets the absolute URLs for the health check page for both secure and
     * non-secure protocols. If the port is not enabled then the URL is
     * excluded.
     *
     * @return A Set containing the string representation of health check urls
     *         for secure and non secure protocols
     */
    public HashSet<String> getHealthCheckUrls() {
        return healthCheckUrls;
    }

    public void setHealthCheckUrls(HashSet<String> healthCheckUrls) {
        this.healthCheckUrls = healthCheckUrls;
    }

    public InstanceLocation getInstanceLocation() {
        return instanceLocation;
    }

    public void setInstanceLocation(InstanceLocation instanceLocation) {
        this.instanceLocation = instanceLocation;
    }

    // ------------------------------------------
    // Non-bean methods
    // ------------------------------------------

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        InstanceInfo that = (InstanceInfo) o;

        if (app != null ? !app.equals(that.app) : that.app != null) {
            return false;
        }
        if (appGroup != null ? !appGroup.equals(that.appGroup) : that.appGroup != null) {
            return false;
        }
        if (asg != null ? !asg.equals(that.asg) : that.asg != null) {
            return false;
        }
        if (healthCheckUrls != null ? !healthCheckUrls.equals(that.healthCheckUrls) : that.healthCheckUrls != null) {
            return false;
        }
        if (homePageUrl != null ? !homePageUrl.equals(that.homePageUrl) : that.homePageUrl != null) {
            return false;
        }
        if (hostname != null ? !hostname.equals(that.hostname) : that.hostname != null) {
            return false;
        }
        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) {
            return false;
        }
        if (ports != null ? !ports.equals(that.ports) : that.ports != null) {
            return false;
        }
        if (securePorts != null ? !securePorts.equals(that.securePorts) : that.securePorts != null) {
            return false;
        }
        if (secureVipAddress != null ? !secureVipAddress.equals(that.secureVipAddress) : that.secureVipAddress != null) {
            return false;
        }
        if (status != that.status) {
            return false;
        }
        if (statusPageUrl != null ? !statusPageUrl.equals(that.statusPageUrl) : that.statusPageUrl != null) {
            return false;
        }
        if (vipAddress != null ? !vipAddress.equals(that.vipAddress) : that.vipAddress != null) {
            return false;
        }
        if (instanceLocation != null ? !instanceLocation.equals(that.instanceLocation) : that.instanceLocation != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (appGroup != null ? appGroup.hashCode() : 0);
        result = 31 * result + (app != null ? app.hashCode() : 0);
        result = 31 * result + (asg != null ? asg.hashCode() : 0);
        result = 31 * result + (vipAddress != null ? vipAddress.hashCode() : 0);
        result = 31 * result + (secureVipAddress != null ? secureVipAddress.hashCode() : 0);
        result = 31 * result + (hostname != null ? hostname.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (ports != null ? ports.hashCode() : 0);
        result = 31 * result + (securePorts != null ? securePorts.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (homePageUrl != null ? homePageUrl.hashCode() : 0);
        result = 31 * result + (statusPageUrl != null ? statusPageUrl.hashCode() : 0);
        result = 31 * result + (healthCheckUrls != null ? healthCheckUrls.hashCode() : 0);
        result = 31 * result + (instanceLocation != null ? instanceLocation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "InstanceInfo{" +
                "id='" + id + '\'' +
                ", appGroup='" + appGroup + '\'' +
                ", app='" + app + '\'' +
                ", asg='" + asg + '\'' +
                ", vipAddress='" + vipAddress + '\'' +
                ", secureVipAddress='" + secureVipAddress + '\'' +
                ", hostname='" + hostname + '\'' +
                ", ip='" + ip + '\'' +
                ", ports=" + ports +
                ", securePorts=" + securePorts +
                ", status=" + status +
                ", homePageUrl='" + homePageUrl + '\'' +
                ", statusPageUrl='" + statusPageUrl + '\'' +
                ", healthCheckUrls=" + healthCheckUrls +
                ", instanceLocation=" + instanceLocation +
                '}';
    }

    // ------------------------------------------
    // Instance Status
    // ------------------------------------------

    public enum Status {
        UP,             // Ready for traffic
        DOWN,           // Not ready for traffic - healthcheck failure
        STARTING,       // Not ready for traffic - still initialising
        OUT_OF_SERVICE, // Not ready for traffic - user initiated operation
        UNKNOWN;

        public static Status toEnum(String s) {
            for (Status e : Status.values()) {
                if (e.name().equalsIgnoreCase(s)) {
                    return e;
                }
            }
            return UNKNOWN;
        }
    }

    // ------------------------------------------
    // Builder
    // ------------------------------------------

    public static final class Builder {

        private InstanceInfo info;

        public Builder() {
            info = new InstanceInfo();
        }

        public Builder withInstanceInfo(InstanceInfo another) {
            info.setId(another.getId());
            info.setAppGroup(another.getAppGroup());
            info.setApp(another.getApp());
            info.setAsg(another.getAsg());
            info.setVipAddress(another.getVipAddress());
            info.setSecureVipAddress(another.getSecureVipAddress());
            info.setHostname(another.getHostname());
            info.setIp(another.getIp());
            info.setPorts(another.getPorts());
            info.setSecurePorts(another.getSecurePorts());
            info.setStatus(another.getStatus());
            info.setHomePageUrl(another.getHomePageUrl());
            info.setStatusPageUrl(another.getStatusPageUrl());
            info.setHealthCheckUrls(another.getHealthCheckUrls());
            info.setInstanceLocation(another.getInstanceLocation());
            return this;
        }

        public Builder withId(String id) {
            info.setId(id);
            return this;
        }

        public Builder withAppGroup(String appGroup) {
            info.setAppGroup(appGroup);
            return this;
        }

        public Builder withApp(String app) {
            info.setApp(app);
            return this;
        }

        public Builder withAsg(String asg) {
            info.setAsg(asg);
            return this;
        }

        public Builder withVipAddress(String vipAddress) {
            info.setVipAddress(vipAddress);
            return this;
        }

        public Builder withSecureVipAddress(String secureVipAddress) {
            info.setSecureVipAddress(secureVipAddress);
            return this;
        }

        public Builder withHostname(String hostname) {
            info.setHostname(hostname);
            return this;
        }

        public Builder withIp(String ip) {
            info.setIp(ip);
            return this;
        }

        public Builder withPorts(HashSet<Integer> ports) {
            info.setPorts(ports);
            return this;
        }

        public Builder withSecurePorts(HashSet<Integer> securePorts) {
            info.setSecurePorts(securePorts);
            return this;
        }

        public Builder withStatus(Status status) {
            info.setStatus(status);
            return this;
        }

        public Builder withHomePageUrl(String homePageUrl) {
            info.setHomePageUrl(homePageUrl);
            return this;
        }

        public Builder withStatusPageUrl(String statusPageUrl) {
            info.setStatusPageUrl(statusPageUrl);
            return this;
        }

        public Builder withHealthCheckUrls(HashSet<String> healthCheckUrls) {
            info.setHealthCheckUrls(healthCheckUrls);
            return this;
        }

        public Builder withInstanceLocation(InstanceLocation location) {
            info.setInstanceLocation(location);
            return this;
        }

        public InstanceInfo build() {
            // validate and sanitize
            return info;
        }
    }
}